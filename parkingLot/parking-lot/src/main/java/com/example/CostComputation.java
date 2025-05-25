package com.example;

public class CostComputation {
    private Ticket ticket;

    public CostComputation(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public abstract double getHourlyParkingCharge() {
    }

    public abstract double getPerMinuteParkingCharge(){

    }

    public abstract double getDefaultParkingCharge() {
        
    }
}
