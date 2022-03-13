import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private ArrayList<String> locations ;
    private int locationCount;


    TouristTicket(int pnrNumber, String departure, String destination, String flightName, LocalDate dateOfDeparture, LocalTime timeOfDeparture, LocalDate dateOfArrival, LocalTime timeOfArrival, int seatNumber, float priceOfTicker,String hotelAddress){
        super(pnrNumber,departure, destination,flightName,dateOfDeparture, timeOfDeparture, dateOfArrival, timeOfArrival,seatNumber,priceOfTicker);

        this.hotelAddress = hotelAddress;
        locations= new ArrayList<String>();
    }
    public void addTouristLocation(String location){
        if(locationCount<=4){
            locations.add(location);
            locationCount+=1;
        }
    }
    public void removeTouristLocation(String location){
        for (int i = 0; i < locations.size(); i++) {
            if(locations.get(i)==location){
                locations.remove(i);
            }
        }
    }
    // this method is for testing purpose

    public String printLocations(){
        String l="";
        for(String i:locations){
            l=l+i+"\n";
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println("Locations Added");
        LocalTime toa2 = LocalTime.of(8,23,01);
        LocalTime tod2 = LocalTime.of(14,55,30);
        LocalDate dod2 = LocalDate.of(2021, 7, 18);
        LocalDate doa2 = LocalDate.of(2021, 7, 17);
        TouristTicket tt= new TouristTicket(2005, "mumbai", "washington", "Dolphin Airways", dod2,tod2,doa2, toa2,27, 52254,"ARC HOTEL Washington DC, Georgetown");
        tt.addTouristLocation("italy");
        tt.addTouristLocation("sweden");
        tt.addTouristLocation("japan");
        tt.addTouristLocation("korea");
        System.out.println(tt.printLocations());
        tt.removeTouristLocation("italy");
        tt.removeTouristLocation("japan");
        System.out.println("Locations after removig Italy and japan");
        System.out.println(tt.printLocations());

    }

    public String getHotelAddress() {
        return hotelAddress;
    }
    public int getLocationCount() {
        return locationCount;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }
}
