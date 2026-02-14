package com.motorcycle.management_system.dataAccess;

import com.motorcycle.management_system.entities.Motorcycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMotorcycleRepository extends JpaRepository<Motorcycle, Integer> {
}