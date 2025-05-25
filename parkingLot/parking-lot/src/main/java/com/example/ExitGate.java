package com.example;

public class ExitGate {
    private Ticket ticket;
    private PricingStrategy pricingStrategy;
    private CostComputationFactory costComputationFactory;
    private ParkingLot parkingLot;

    public ExitGate(Ticket ticket, PricingStrategy pricingStrategy, CostComputationFactory costComputationFactory, ParkingLot parkingLot)  {
        this.ticket = ticket;
        this.pricingStrategy = pricingStrategy;
        this.costComputationFactory = costComputationFactory;
        this.parkingLot = parkingLot;
    }

    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public CostComputation getCostComputation() {
        return this.costComputationFactory.getCostComputation(this.ticket.vehicle.getVehicleType());
    }

    public price() {
        return this.pricingStrategy.price(this.getCostComputation());
    }

    public payment() {

    }

    public boolean removeVehicle() {
        return this.removeVehicle(this.ticket.getVehicle().getVehicleNumber());
    }
}
