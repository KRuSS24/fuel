package com.home.fuel.repositories;

import com.home.fuel.entities.FuelCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuelCardRepo extends JpaRepository<FuelCardEntity,Long> {
}
