package com.example;

import java.util.Comparator;
import java.util.List;

public class NearToEntranceParkingStrategy extends ParkingStrategy {
    private EntranceGate entryGate;

    public NearToEntranceParkingStrategy(EntranceGate entryGate) {
        this.entryGate = entryGate;
    }

    @Override
    ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpots, VehicleType vehicleType) {
        return parkingSpots.stream()
                .filter(spot -> spot.getVehicleType().equals(vehicleType) && spot.getIsEmpty())
                .min(Comparator.comparingDouble(spot -> distance(spot, gate)))
                .orElse(null);
    }

    private double distance(ParkingSpot spot, EntranceGate gate) {
        // Dummy Euclidean distance calculation
        return Math.sqrt(Math.pow(spot.getX() - gate.getX(), 2) + Math.pow(spot.getY() - gate.getY(), 2));
    }
}
