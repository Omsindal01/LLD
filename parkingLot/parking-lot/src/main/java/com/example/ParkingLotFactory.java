package com.example;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotFactory {
    private List<ParkingSpot> spots;
    private List<EntranceGate> gates;
    private ParkingLot parkingLot;

    public ParkingLotFactory(List<ParkingSpot> spots, List<EntranceGate> gates) {
        this.spots = spots;
        this.gates = gates;
    }

    public List<ParkingSpot> getSpots() {
        return spots;
    }


    public void setSpots(List<ParkingSpot> spots) {
        this.spots = spots;
    }


    public List<EntranceGate> getGates() {
        return gates;
    }


    public void setGates(List<EntranceGate> gates) {
        this.gates = gates;
    }


    public getParkingLot(VehicleType vehicleType) {
        switch (vehicleType) {
            case TWO_WHEELER:
                this.parkingLot = new TwoWheelerParkingLot(this.spots, this.gates);
                break;
            case FOUR_WHEELER:
                this.parkingLot = new FourWheelerParkingLot(this.spots, this.gates);
                break;
            default:
                throw new IllegalArgumentException("Unsupported vehicle type: " + vehicleType);
        }

        return this.parkingLot;
    }
}