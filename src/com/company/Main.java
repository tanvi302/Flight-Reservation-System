package com.company;

public class Main {

    public static void main(String[] args) {

        //checkpoint 2 Test case
Passenger person=new Passenger ("Rohini","New Delhi","Delhi",
        "Tanvi","987343241","xyz@gmail.com");

Flight SpiceJet=new Flight("A456","Spice Jet",500,78);

// checkpoint 3 Test Case
        Flight Indigo=new Flight("A986","Indigo",600,200);
      // Indigo.flightNumber="A456"; (Error while accessing private variables)
        Indigo.setAirline("British Airways");
        Indigo.getAirline();

        //checkpoint 5 Test Case
        RegularTicket ticket1=new RegularTicket("ArNa123","London","America"
        ,Indigo,"3/04/2021","5/04/2021","13:25","17:45",
                "56",9088,false,"water");

String[] loc = {"LA","San-francisco","Washington"};
        //checkpoint 5 Test Case
        TouristTicket ticket2=new TouristTicket("ArNa123","London","America"
                ,SpiceJet,"3/04/2021","5/04/2021","13:25","17:45",
                "56",9088,false,"New jersey",loc);

        printTicketDetails(ticket1);
        printTicketDetails(ticket2);
    }
    public static void printTicketDetails(Ticket ticket )
    {

       System.out.println(ticket.getPnrNumber());

    }


}
