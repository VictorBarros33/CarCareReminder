package com.seuusuario.carcare.model;

public class MaintenanceItem {
    private String id;
    private String carId;
    private String type;
    private String title;
    private String description;
    private String status;
    private int recommendedKm;
    private int lastMaintenanceKm;
    private long lastMaintenanceDate;
    private String[] details;

    public MaintenanceItem() {}

    public MaintenanceItem(String type, String title, String description, int recommendedKm) {
        this.type = type;
        this.title = title;
        this.description = description;
        this.recommendedKm = recommendedKm;
    }

    // Getters
    public String getId() { return id; }
    public String getCarId() { return carId; }
    public String getType() { return type; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }
    public int getRecommendedKm() { return recommendedKm; }
    public int getLastMaintenanceKm() { return lastMaintenanceKm; }
    public long getLastMaintenanceDate() { return lastMaintenanceDate; }
    public String[] getDetails() { return details; }

    // Setters
    public void setId(String id) { this.id = id; }
    public void setCarId(String carId) { this.carId = carId; }
    public void setType(String type) { this.type = type; }
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setStatus(String status) { this.status = status; }
    public void setRecommendedKm(int recommendedKm) { this.recommendedKm = recommendedKm; }
    public void setLastMaintenanceKm(int km) { this.lastMaintenanceKm = km; }
    public void setLastMaintenanceDate(long date) { this.lastMaintenanceDate = date; }
    public void setDetails(String[] details) { this.details = details; }

    public int getRemainingKm(int currentKm) {
        return (lastMaintenanceKm + recommendedKm) - currentKm;
    }

    public void calculateStatus(int currentKm) {
        int remaining = getRemainingKm(currentKm);
        if (remaining < 500) {
            this.status = "urgent";
        } else if (remaining < 2000) {
            this.status = "warning";
        } else {
            this.status = "ok";
        }
    }
}