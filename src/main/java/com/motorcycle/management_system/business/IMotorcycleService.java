package com.motorcycle.management_system.business;

import com.motorcycle.management_system.entities.Motorcycle;

import java.util.List;

public interface IMotorcycleService {
    List<Motorcycle> getAll();
    void add(Motorcycle motorcycle);
    void update(Motorcycle motorcycle);
    void delete(int id);
    Motorcycle getById(int id);

}
