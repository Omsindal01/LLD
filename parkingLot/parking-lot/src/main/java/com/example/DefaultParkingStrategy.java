package com.example;

import java.util.List;

public class DefaultParkingStrategy extends ParkingStrategy {
    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpots, VehicleType vehicleType) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isEmpty() && spot.getVehicleType().equals(vehicleType)) {
                return spot;
            }
        }
        return null;
    }
}
