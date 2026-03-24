package com.motorcycle.management_system.api;

import com.motorcycle.management_system.business.IMotorcycleService;
import com.motorcycle.management_system.entities.Motorcycle;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/motorcycles")
@RequiredArgsConstructor
public class MotorcyclesController {

    private final IMotorcycleService motorcycleService;

    @GetMapping("/getall")
    public List<Motorcycle> getAll(){
        return motorcycleService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Motorcycle motorcycle){
        motorcycleService.add(motorcycle);
    }
}