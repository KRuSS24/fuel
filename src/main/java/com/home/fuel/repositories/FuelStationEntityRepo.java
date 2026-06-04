package com.home.fuel.repositories;

import com.home.fuel.entities.FuelStationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuelStationEntityRepo extends JpaRepository<FuelStationEntity,Long> {
}
