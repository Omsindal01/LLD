package com.example;

public class DefaultPricingStrategy {
    public DefaultPricingStrategy(Ticket ticket) {
        super(ticket);
    }

    @Override
    public price(CostComputation costComputation) {
        return costComputation.getDefaultParkingCharge();
    }
}
