package com.seuusuario.carcare.model;

public class Car {
    private String id;
    private String userId;
    private String brand;
    private String model;
    private String year;
    private String engine;
    private int dailyKm;
    private int currentKm;
    private String imageUrl;

    public Car() {}

    public Car(String brand, String model, String year, String engine, int dailyKm) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.dailyKm = dailyKm;
    }

    // Getters
    public String getId() { return id; }
    public String getUserId() { return userId; }
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getYear() { return year; }
    public String getEngine() { return engine; }
    public int getDailyKm() { return dailyKm; }
    public int getCurrentKm() { return currentKm; }
    public String getImageUrl() { return imageUrl; }

    // Setters
    public void setId(String id) { this.id = id; }
    public void setUserId(String userId) { this.userId = userId; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setYear(String year) { this.year = year; }
    public void setEngine(String engine) { this.engine = engine; }
    public void setDailyKm(int dailyKm) { this.dailyKm = dailyKm; }
    public void setCurrentKm(int currentKm) { this.currentKm = currentKm; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public String getFullName() {
        return brand + " " + model + " " + engine + " - " + year;
    }

    public int getMonthlyKm() {
        return dailyKm * 30;
    }

    public int getYearlyKm() {
        return dailyKm * 365;
    }
}