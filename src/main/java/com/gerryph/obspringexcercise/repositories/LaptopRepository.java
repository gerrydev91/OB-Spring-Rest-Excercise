package com.gerryph.obspringexcercise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerryph.obspringexcercise.entities.Laptop;

public interface LaptopRepository extends JpaRepository <Laptop, Long>{
    
}
