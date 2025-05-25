package com.example;

import java.util.List;

public class FourWheelerParkingLot extends ParkingLot {
    private List<ParkingSpot> parkingSpots;
    private List<EntranceGate> entranceGates;

    public FourWheelerParkingLot(List<ParkingSpot> parkingSpots, List<EntranceGate> entranceGates) {
        super(parkingSpots, entranceGates);
    }

}
