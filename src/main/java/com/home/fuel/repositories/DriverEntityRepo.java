package com.home.fuel.repositories;

import com.home.fuel.entities.DriverEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverEntityRepo extends JpaRepository<DriverEntity,Long> {
}
