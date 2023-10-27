package org.example.entities;

public class Car {
    private int id;
    private String carBrand;
    private String carModelName;
    private Double price;
    private int stockAmount;

    public Car() {
    }

    public Car(int id, String carBrand, String carModelName, Double price, int stockAmount) {
        this.id = id;
        this.carBrand = carBrand;
        this.carModelName = carModelName;
        this.price = price;
        this.stockAmount = stockAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModelName() {
        return carModelName;
    }

    public void setCarModelName(String carModelName) {
        this.carModelName = carModelName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
}
