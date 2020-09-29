package com.emlakjet.emlakjetyonetim.repository;

import com.emlakjet.emlakjetyonetim.entities.AdEntity;
import com.emlakjet.emlakjetyonetim.entities.OfficeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdRepository extends JpaRepository<AdEntity, Long> {

    AdEntity save(AdEntity adEntity);

    List<AdEntity> findAllBy();


}
