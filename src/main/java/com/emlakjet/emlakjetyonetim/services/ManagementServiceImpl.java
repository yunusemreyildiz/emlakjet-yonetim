package com.emlakjet.emlakjetyonetim.services;

import com.emlakjet.emlakjetyonetim.entities.AdEntity;
import com.emlakjet.emlakjetyonetim.entities.OfficeEntity;
import com.emlakjet.emlakjetyonetim.models.CreateAdRequest;
import com.emlakjet.emlakjetyonetim.models.CreateOfficeRequest;
import com.emlakjet.emlakjetyonetim.repository.AdRepository;
import com.emlakjet.emlakjetyonetim.repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ManagementServiceImpl implements ManagementService {
    @Autowired
    private AdRepository adRepository;
    @Autowired
    private OfficeRepository officeRepository;

    @Override
    //@Transactional
    public HttpStatus saveAd(CreateAdRequest createAdRequest) {
        AdEntity adEntity = requestToAdEntity(createAdRequest);
        try {
            saveAdEntity(adEntity);
        } catch (Exception e) {
            return HttpStatus.FORBIDDEN;
        }
        return HttpStatus.OK;

    }

    @Override
    public List<OfficeEntity> getAddListByOfficeID(int officeID) {
        return officeRepository.listAddByOfficeID(officeID);
    }

    @Override
    public void saveOffice(CreateOfficeRequest createOfficeRequest) {
        OfficeEntity officeEntity = requestToOfficeEntity(createOfficeRequest);
        saveOfficeEntity(officeEntity);
    }

    @Override
    public List<OfficeEntity> getAllOfficeInfo() {
        return officeRepository.findAll();
    }


    public void saveAdEntity(AdEntity adEntity) {
        adRepository.save(adEntity);

    }

    public void saveOfficeEntity(OfficeEntity officeEntity) {
        officeRepository.save(officeEntity);

    }

    private AdEntity requestToAdEntity(CreateAdRequest createAdRequest) {
        AdEntity adEntity = new AdEntity();
        adEntity.setAdTitle(createAdRequest.getAdTitle());
        adEntity.setAdM2(createAdRequest.getM2());
        adEntity.setPrice(createAdRequest.getPrice());

        adEntity.setOfficeID(createAdRequest.getofficeID());
        return adEntity;
    }

    private OfficeEntity requestToOfficeEntity(CreateOfficeRequest createOfficeRequest) {
        OfficeEntity officeEntity = new OfficeEntity();
        officeEntity.setOfficeName(createOfficeRequest.getOfficeName());
        officeEntity.setEmail(createOfficeRequest.getEmail());
        officeEntity.setFirstName(createOfficeRequest.getFirstName());
        officeEntity.setSurname(createOfficeRequest.getSurname());
        return officeEntity;
    }


}
