package com.example;

public class CostCompurationFactory {
    private CostComputation costComputation;

    public CostCompurationFactory(Ticket ticket, PricingStrategy pricingStrategy) {
        this.ticket = ticket;
        this.pricingStrategy = pricingStrategy;
    }

    public CostComputation getCostComputation(VehicleType vehicleType) {
        switch (vehicleType) {
            case TWO_WHEELER:
                this.costComputation = new TwoWheelerCostComputation(this.ticket, this.pricingStrategy);
                break;
            case FOUR_WHEELER:
                this.costComputation = new FourWheelerCostComputation(this.ticket, this.pricingStrategy);
                break;
            default:
                throw new IllegalArgumentException("Unsupported vehicle type: " + vehicleType);
        }

        return this.costComputation;
    }  
}
