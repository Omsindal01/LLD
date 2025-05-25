package com.example;

public class EntranceGate {
    private x,y;
    private ParkingLotFactory parkingLotFactory;
    private ParkingLot parkingLot;

    public EntranceGate(int x, int y, ParkingLotFactory parkingLotFactory){
        this.x = x;
        this.y = y;
        this.parkingLotFactory = parkingLotFactory;
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

    public ParkingLotFactory getParkingLotFactory() {
        return parkingLotFactory;
    }
    public void setParkingLotFactory(ParkingLotFactory parkingLotFactory) {
        this.parkingLotFactory = parkingLotFactory;
    }
    public ParkingLot setParkingLot(VehicleType vehicleType) {
        this.parkingLot = this.parkingLotFactory.getParkingLot(vehicleType);
    }

    public ParkingSpot findSpace(ParkingStrategy parkingStrategy) {
        return this.parkingLot.findParkingSpot(parkingStrategy);
    }

    public boolean bookSpot(Vehicle vehicle, ParkingSpot parkingSpot) {
        boolean isBookingConfirmed = this.parkingLot.parkVehicle(vehicle, parkingSpot);
        if(isBookingConfirmed) {
            System.out.println("Spot booked for vehicle: " + vehicle.getVehicleNumber() + " at spot: " + parkingSpot.getId());
            return true;
        } else {
            System.out.println("Spot not available");
            return false;
        }
    }

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        return new Ticket(System.currentTimeMillis(), vehicle, parkingSpot);
    }
}
