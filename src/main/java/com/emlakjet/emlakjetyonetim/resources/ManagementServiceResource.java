package com.emlakjet.emlakjetyonetim.resources;

import com.emlakjet.emlakjetyonetim.entities.OfficeEntity;
import com.emlakjet.emlakjetyonetim.models.CreateAdRequest;
import com.emlakjet.emlakjetyonetim.models.CreateOfficeRequest;
import com.emlakjet.emlakjetyonetim.services.ManagementServiceImpl;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/management")
@Data
public class ManagementServiceResource {
    @Autowired
    private ManagementServiceImpl managementService;

    @PostMapping(path = "/saveAd")
    public HttpStatus saveAd(@RequestBody CreateAdRequest request) {
        HttpStatus status = managementService.saveAd(request);
        return status;
    }

    @PostMapping(path = "/saveOffice")
    public ResponseEntity<String> saveOffice(@RequestBody CreateOfficeRequest request) {
        managementService.saveOffice(request);
        return new ResponseEntity("Succes", HttpStatus.OK);
    }

    @GetMapping(path = "/getList")
    public ResponseEntity<List<OfficeEntity>> getList() {
        List<OfficeEntity> officeEntity = managementService.getAllOfficeInfo();
        return new ResponseEntity(officeEntity, HttpStatus.OK);
    }

    @PostMapping(path = "/getAddListbyOfficeName")
    public ResponseEntity<List<OfficeEntity>> getAddListByOfficeName(@RequestParam("officeID") int officeID) {
        List<OfficeEntity> officeEntity = managementService.getAddListByOfficeID(officeID);
        return new ResponseEntity(officeEntity, HttpStatus.OK);
    }



}
