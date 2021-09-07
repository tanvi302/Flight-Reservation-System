package com.company;

public class  RegularTicket extends Ticket{
     private String specialServices;

    public RegularTicket(String pnrNumber, String departureLocation, String destinationLocation,
                         Flight flight, String dateDeparture, String dateArrival, String timeDeparture,
                         String timeArrival, String seatNumber, int price, boolean cancel,String specialServices) {

        super(pnrNumber, departureLocation, destinationLocation, flight, dateDeparture, dateArrival,
                timeDeparture, timeArrival, seatNumber, price, cancel);
        this.specialServices=specialServices;
    }

    public String getSpecialServices() {
        return specialServices;
    }

    public void updateSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }



}
