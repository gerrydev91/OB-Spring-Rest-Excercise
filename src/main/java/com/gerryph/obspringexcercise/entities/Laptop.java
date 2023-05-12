package com.gerryph.obspringexcercise.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="laptops")
public class Laptop {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String make; 

    private String model;

    private Integer numProcessors;

    private Double memory;

    private Double price;

    private boolean isOnStock;

    public Laptop() {
    }

    public Laptop(Long id, String make, String model, Integer numProcessors, Double memory, Double price,
            boolean isOnStock) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.numProcessors = numProcessors;
        this.memory = memory;
        this.price = price;
        this.isOnStock = isOnStock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getNumProcessors() {
        return numProcessors;
    }

    public void setNumProcessors(Integer numProcessors) {
        this.numProcessors = numProcessors;
    }

    public Double getMemory() {
        return memory;
    }

    public void setMemory(Double memory) {
        this.memory = memory;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean isOnStock() {
        return isOnStock;
    }

    public void setOnStock(boolean isOnStock) {
        this.isOnStock = isOnStock;
    }

    
    


    
}
