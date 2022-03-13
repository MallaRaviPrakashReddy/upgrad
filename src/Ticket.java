import java.time.*;
import java.time.temporal.ChronoUnit;

public class Ticket {

    private int pnrNumber;
    private String departure;
    private  String destination;
    private String flightName;
    private LocalDate dateOfDeparture;
    private LocalTime  timeOfDeparture;
    private LocalDate dateOfArrival;
    private LocalTime  timeOfArrival;
    private Passenger passenger;
    private int seatNumber;
    private float priceOfTicker;
    private boolean ticketStatus;
    public Flight flight;

    //    Ticket(){
//        RegularTicket regularTicket=new RegularTicket();
//        TouristTicket touristTicket=new TouristTicket();
//    }
    Ticket(int pnrNumber, String departure, String destination, String flightName, LocalDate dateOfDeparture, LocalTime timeOfDeparture, LocalDate dateOfArrival, LocalTime timeOfArrival, int seatNumber, float priceOfTicker) {
        this.pnrNumber = pnrNumber;
        this.departure = departure;
        this.destination = destination;
        this.flightName = flightName;
        this.dateOfDeparture = dateOfDeparture;
        this.timeOfDeparture = timeOfDeparture;
        this.dateOfArrival = dateOfArrival;
        this.timeOfArrival = timeOfArrival;
        this.seatNumber = seatNumber;
        this.priceOfTicker = priceOfTicker;
    }
//    Ticket() {
//        this.pnrNumber = pnrNumber;
//        this.departure = departure;
//        this.destination = destination;
//        this.flightName = flightName;
//        this.dateOfDeparture = dateOfDeparture;
//        this.timeOfDeparture = timeOfDeparture;
//        this.dateOfArrival = dateOfArrival;
//        this.timeOfArrival = timeOfArrival;
//        this.seatNumber = seatNumber;
//        this.priceOfTicker = priceOfTicker;
//    }


    public String checkStatus(){
        if(ticketStatus==true){
            return "Active";
        }
        else{
            return "inactive";
        }
    }
    public void setTicketStatus() {
        this.ticketStatus = true;
    }
    public void cancelTicketStatus(){
        this.ticketStatus= false;
    }
    public String getDuration(){
        //          testcase-1
        //        dateOfDeparture = LocalDate.of(2014, Month.JULY, 4);
        //        dateOfArrival= LocalDate.of(2014, Month.DECEMBER, 25);
        //        timeOfDeparture= LocalTime.parse("10:15:30");
        //        timeOfArrival= LocalTime.parse("12:21:30");
        try{
            Long hour= timeOfDeparture.until(timeOfArrival, ChronoUnit.HOURS);
            Long min=  timeOfDeparture.until(timeOfArrival, ChronoUnit.MINUTES)-hour*60;
            Long sec= timeOfDeparture.until(timeOfArrival,ChronoUnit.SECONDS)-(hour*60)*60-min*60;
            Long days= ChronoUnit.DAYS.between(dateOfDeparture,dateOfArrival);

            return "Duration: "+days+" days , "+hour+" hours "+min+" minutes "+sec+" seconds";

        }catch (NullPointerException e){

            return "Duration: "+0+" days , "+0+" hours "+0+" minutes "+0+" seconds";
        }
    }

    public int getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(int pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public float getPriceOfTicker() {
        return priceOfTicker;
    }

    public void setPriceOfTicker(float priceOfTicker) {
        this.priceOfTicker = priceOfTicker;
    }
     public static void main(String[] args){
         LocalDate dod2 = LocalDate.of(2014, Month.JULY, 4);
         LocalDate doa2= LocalDate.of(2014, Month.DECEMBER, 25);
         LocalTime tod2= LocalTime.parse("10:15:30");
         LocalTime toa2= LocalTime.parse("12:21:30");
        Ticket t=new Ticket(2005, "mumbai", "washington", "Dolphin Airways", dod2,tod2,doa2, toa2,27, 52254);
        System.out.println(t.checkStatus());
        System.out.println(t.getDuration());

     }

}
