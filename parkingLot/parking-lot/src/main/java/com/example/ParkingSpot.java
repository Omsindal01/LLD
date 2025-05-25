package com.example;

public class ParkingSpot {
    private int x,y;
    private int id;
    private Boolean isEmpty;
    private Vehicle vehicle;
    private VehicleType vehicleType;

    ParkingSpot(int x,int y, int id, Boolean isEmpty, Vehicle vehicle, VehicleType vehicleType) {
        this.x = x;
        this.y = y;
        this.id = id;
        this.isEmpty = isEmpty;
        this.vehicle = vehicle;
        this.vehicleType = vehicleType;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Boolean getIsEmpty() {
        return isEmpty;
    }
    public void setIsEmpty(Boolean isEmpty) {
        this.isEmpty = isEmpty;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isEmpty = true;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
