package com.example;

import java.util.List;

public class TwoWheelerParkingLot extends ParkingLot {
    private List<ParkingSpot> parkingSpots;
    private List<EntranceGate> entranceGates;
    
    public TwoWheelerParkingLot(List<ParkingSpot> parkingSpots, List<EntranceGate> entranceGates) {
        super(parkingSpots, entranceGates);
    }
}
