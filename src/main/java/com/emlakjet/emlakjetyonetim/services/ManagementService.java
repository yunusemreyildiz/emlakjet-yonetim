package com.emlakjet.emlakjetyonetim.services;

import com.emlakjet.emlakjetyonetim.entities.OfficeEntity;
import com.emlakjet.emlakjetyonetim.models.CreateAdRequest;
import com.emlakjet.emlakjetyonetim.models.CreateOfficeRequest;
import org.springframework.http.HttpStatus;

import java.util.List;

public interface ManagementService {

    void saveOffice(CreateOfficeRequest createOfficeRequest);

    HttpStatus saveAd(CreateAdRequest createAdRequest);

    List<OfficeEntity> getAddListByOfficeID(int officeID);

    List<OfficeEntity> getAllOfficeInfo();


}

