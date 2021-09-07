package com.company;

public class Flight {
    private String flightNumber;
    private String airline;
    private int totalCapacity;
    private static int seatsBooked=0;

    //constructor
    public Flight(String flightNumber, String airline, int totalCapacity, int seatsBooked) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.totalCapacity = totalCapacity;
        this.seatsBooked = seatsBooked;
    }

    //getters and setters
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public int getSeatsBooked() {
        return seatsBooked;
    }

    public void setSeatsBooked(int seatsBooked) {
        this.seatsBooked = seatsBooked;
    }

    //methods
     public String getFlightDetails()
     {
         return ("Flight Number: " + this.flightNumber+" , "+"Airline: "+this.airline+" , "
         + "Total Seats Booked: "+this.totalCapacity+" , " +"Seats Booked: "+this.seatsBooked);
     }
    public boolean availableSeats()
    {
        int avail=this.totalCapacity-this.seatsBooked;
        if(avail!=0)
        {
            return  true;
        }
        return false;
    }
    public  void updateSeatsCounter()
    {
        this.seatsBooked++;
    }

}
