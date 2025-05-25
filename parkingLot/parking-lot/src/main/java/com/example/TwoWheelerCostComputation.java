package com.example;

public class TwoWheelerCostComputation extends CostComputation {
    
    public TwoWheelerCostComputation(Ticket ticket){
        super(ticket);
    }

    @Override
    public double getHourlyParkingCharge() {
        return 20;
    }

    @Override
    public double getPerMinuteParkingCharge() {
        return 0.5;
    }

    @Override
    public double getDefaultParkingCharge() {
        return 50;
    }
}
