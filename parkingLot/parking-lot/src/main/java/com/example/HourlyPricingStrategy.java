package com.example;

public class HourlyPricingStrategy extends PricingStrategy {
    public HourlyPricingStrategy(Ticket ticket) {
        super(ticket);
    }

    @Override
    public double price(CostComputation costComputation) {
        long durationInHours = (System.currentTimeMillis() - ticket.getEntryTime().getTime()) / (1000 * 60 * 60);
        if (durationInHours == 0) durationInHours = 1; // minimum 1 hour
        return costComputation.getHourlyParkingCharge()*durationInHours;
    }
}
