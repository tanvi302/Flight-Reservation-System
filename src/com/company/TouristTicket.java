package com.company;


public class TouristTicket extends Ticket{
    private  String hotelAddress;
     private String[] selectedTouristLocation=new String[5];
    public TouristTicket(String pnrNumber, String departureLocation, String destinationLocation,
                         Flight flight, String dateDeparture, String dateArrival, String timeDeparture,
                         String timeArrival, String seatNumber, int price, boolean cancel,String hotelAddress
    ,String[] selectedTouristLocation) {
        super(pnrNumber, departureLocation, destinationLocation, flight, dateDeparture, dateArrival,
                timeDeparture, timeArrival, seatNumber, price, cancel);
        this.hotelAddress= hotelAddress;
        this.selectedTouristLocation=selectedTouristLocation;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getTouristLocation() {
        int i;

        return selectedTouristLocation ;
    }

    public void setTouristLocation(String[]  selectedTouristLocation) {
        this. selectedTouristLocation=  selectedTouristLocation;
    }

    public String addLocation(String location)
    {
       int size=this.selectedTouristLocation.length;
       if(size<5)
       {
           this.selectedTouristLocation[size-1]=location;
           return "Location Added";
       }
       else {
           return "Only five tourist locations can be added";
       }
    }
    //
    public String removeLocation(String location)
    {
        String[] arr= new String[selectedTouristLocation.length-1];
        int n=0;
        for(int i=0;i<selectedTouristLocation.length;i++)
        {
            if(location==selectedTouristLocation[i])
            {
                continue;
            }
            arr[n]=selectedTouristLocation[i];
            n++;
        }
        selectedTouristLocation=arr;
        return "Location Removed";
    }
}
