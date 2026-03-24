package com.motorcycle.management_system.business;


import com.motorcycle.management_system.dataAccess.IMotorcycleRepository;
import com.motorcycle.management_system.entities.Motorcycle;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MotorcycleManager implements IMotorcycleService {

    private final IMotorcycleRepository motorcycleRepository;

    @Override
    public List<Motorcycle> getAll() {
        return motorcycleRepository.findAll();
    }

    @Override
    public void add(Motorcycle motorcycle) {
        if(motorcycle.getPrice() < 0) {
            throw new RuntimeException("Fiyat 0'dan küçük olamaz!");
        }
        motorcycleRepository.save(motorcycle);
    }

    @Override
    public void update(Motorcycle motorcycle){
        motorcycleRepository.save(motorcycle);
    }

    @Override
    public void delete(int id){
        motorcycleRepository.deleteById(id);
    }

    @Override
    public Motorcycle getById(int id) {
        return motorcycleRepository.findById(id).orElse(null);
    }
}
