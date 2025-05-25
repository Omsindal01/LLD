package com.example;

public class FourWheelerCostComputation extends CostComputation {
    public FourWheelerCostComputation(Ticket ticket){
        super(ticket);
    }

    @Override
    public double getHourlyParkingCharge() {
        return 50;
    }

    @Override
    public double getPerMinuteParkingCharge() {
        return 1;
    }

    @Override
    public double getDefaultParkingCharge() {
        return 100;
    }
}
