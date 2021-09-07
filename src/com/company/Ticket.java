package com.company;

public abstract class Ticket {
   private String pnrNumber;
    private String departureLocation;
    private String destinationLocation;
    private Flight flight;
    private String dateDeparture;
    private String dateArrival;
    private String timeDeparture;
    private String timeArrival;
    private String seatNumber;
    private int price;
    private boolean cancel;

    //constructor
    public Ticket(String pnrNumber, String departureLocation, String destinationLocation, Flight flight,
                  String dateDeparture, String dateArrival,
                  String timeDeparture, String timeArrival, String seatNumber, int price, boolean cancel) {
        this.pnrNumber = pnrNumber;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.flight = flight;
        this.dateDeparture = dateDeparture;
        this.dateArrival = dateArrival;
        this.timeDeparture = timeDeparture;
        this.timeArrival = timeArrival;
        this.seatNumber = seatNumber;
        this.price = price;
        this.cancel = cancel;
    }

    //getters and setters
    public String getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(String dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public String getDateArrival() {
        return dateArrival;
    }

    public void setDateArrival(String dateArrival) {
        this.dateArrival = dateArrival;
    }

    public String getTimeDeparture() {
        return timeDeparture;
    }

    public void setTimeDeparture(String timeDeparture) {
        this.timeDeparture = timeDeparture;
    }

    public String getTimeArrival() {
        return timeArrival;
    }

    public void setTimeArrival(String timeArrival) {
        this.timeArrival = timeArrival;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    //methods
    public String checkStatus(){
        if(this.cancel==true)
        {
            return "Cancelled";
        }
        return  "Confirmed";
    }

    public int getDuration()
    {
        String depart=getTimeDeparture();
        String arrive=getTimeArrival();
        String[] d1 = depart.split(":");
        String d=d1[0]+d1[1];
        String[] a1 = arrive.split(":");
        String a=a1[0]+a1[1];
        int dt=Integer.parseInt(d);
        int at=Integer.parseInt(a);
      if(dt <12 && at>12)
      {
          return(1200-dt)+(at-1200);

      }
      else if(at<dt)
      {
          return 2400 - (dt-at);
      }
      else if(at>12 && dt>12)
      {
          return at-dt;
      }
      else {
          return 0;
      }
    }

    public void cancelTicket()
    {
        this.cancel=true;
    }
}
