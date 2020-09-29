package com.emlakjet.emlakjetyonetim.repository;

import com.emlakjet.emlakjetyonetim.entities.OfficeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OfficeRepository extends JpaRepository<OfficeEntity,Long> {

    OfficeEntity save(OfficeEntity officeEntity);

    List<OfficeEntity> findAll();

    @Query(value="SELECT p.ad_name FROM ad p " +
            "inner join office u on p.office_id = u.office_id " +
            "WHERE u.office_id=:office_id",
            nativeQuery=true)
    List<OfficeEntity> listAddByOfficeID(@Param("office_id") int office_id);
}
