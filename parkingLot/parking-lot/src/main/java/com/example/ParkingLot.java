package com.example;

import java.util.*;

public class ParkingLot {
    private List<ParkingSpot> parkingSpots;
    private List<EntranceGate> entryGates;

    public ParkingLot(List<ParkingSpot> parkingSpots, List<EntranceGate> entryGates) {
        this.parkingSpots = parkingSpots;
        this.entryGates = entryGates;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public ParkingSpot findParkingSpot(ParkingStrategy parkingStrategy) {
        return parkingStrategy.findParkingSpot(this.parkingSpots);
    }

    public void addParkingSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
    }

    public void removeParkingSpot(ParkingSpot spot) {
        parkingSpots.remove(spot);
    }

    public boolean parkVehicle(Vehicle vehicle, ParkingSpot spot) {
        if (spot != null) {
            spot.parkVehicle(vehicle);
            return true;
        }
        return false;
    }

    public boolean removeVehicle(String vehicleNumber) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getVehicle() != null && spot.getVehicle().getNumber().equals(vehicleNumber)) {
                spot.removeVehicle();
                return true;
            }
        }
        return false;
    } 
}
