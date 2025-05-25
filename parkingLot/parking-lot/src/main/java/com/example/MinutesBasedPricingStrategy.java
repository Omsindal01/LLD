package com.example;

public class MinutesBasedPricingStrategy extends PricingStrategy {
    public MinutesBasedPricingStrategy(Ticket ticket) {
        super(ticket);
    }

    @Override
    public double price(CostComputation costComputation) {
        long durationInMinutes = (System.currentTimeMillis() - ticket.getEntryTime().getTime()) / (1000 * 60);
        if (durationInMinutes == 0) durationInMinutes = 1; // minimum 1 minute
        return costComputation.getPerMinuteParkingCharge() * durationInMinutes;
    }
}
