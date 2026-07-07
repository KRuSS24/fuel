package com.home.fuel.repositories;

import com.home.fuel.entities.DriverEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface DriverEntityRepo extends JpaRepository<DriverEntity,Long> {

    @Query("SELECT dr FROM DriverEntity dr WHERE dr.isActive=TRUE ORDER BY dr.lastName ASC")
    List<DriverEntity> findAllWhereIsActive();

    DriverEntity findByFirstNameAndLastNameAndPassport(String firstName, String lastName, String passport);

    Optional<DriverEntity> findById(Long id);

    @Query("SELECT dr FROM DriverEntity dr ORDER BY dr.lastName ASC")
    List<DriverEntity> findAllOrderByLastName();
}

