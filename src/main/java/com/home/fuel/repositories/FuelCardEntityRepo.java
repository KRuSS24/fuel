package com.home.fuel.repositories;

import com.home.fuel.entities.FuelCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuelCardEntityRepo extends JpaRepository<FuelCardEntity,Long> {
}
