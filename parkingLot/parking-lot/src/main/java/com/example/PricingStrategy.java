package com.example;

public class PricingStrategy {
    private Ticket ticket;

    public PricingStrategy(Ticket ticket) {
        this.ticket = ticket;
    }

    public abstract double price(CostComputation costComputation) {

    }


    public Ticket getTicket() {
        return ticket;
    }


    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
