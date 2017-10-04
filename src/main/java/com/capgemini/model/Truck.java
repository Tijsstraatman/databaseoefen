package com.capgemini.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Truck {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String brand;
    private long mileage;

    protected Truck(){}

    public Truck(String brand, long mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }
}