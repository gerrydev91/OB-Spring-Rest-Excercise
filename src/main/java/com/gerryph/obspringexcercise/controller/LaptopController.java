package com.gerryph.obspringexcercise.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gerryph.obspringexcercise.entities.Laptop;
import com.gerryph.obspringexcercise.repositories.LaptopRepository;

@RestController
public class LaptopController {
    
    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    //Find all laptops.

    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }
    

    @PostMapping("/api/laptops")
    public Laptop create(@RequestBody Laptop laptop){

        return laptopRepository.save(laptop);

    }

}
