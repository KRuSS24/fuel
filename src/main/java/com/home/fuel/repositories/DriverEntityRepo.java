package com.home.fuel.repositories;

import com.home.fuel.DTO.DriverDto;
import com.home.fuel.entities.DriverEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DriverEntityRepo extends JpaRepository<DriverEntity,Long> {

    @Query("SELECT dr FROM DriverEntity dr WHERE dr.isActive=TRUE")
    List<DriverEntity> findAllWhereIsActive();

    DriverEntity findByFirstNameAndLastNameAndPassport(String firstName, String lastName, String passpport);
}

