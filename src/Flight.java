public class Flight {
    private int flightNumber;
    private String airline;
    private int capacity;
    private int seatsBooked;

    public String getFlightDetails(){
        return "Flight Number: "+flightNumber+"\nAirline: "+airline+"\nCapacity: "+capacity+"\nSeats Booked: "+seatsBooked;
    }
    public int availableSeats(){
        return capacity-seatsBooked;
    }
    public void bookSeat(){
        seatsBooked+=1;
    }
    Flight(){}
    Flight(int flightNumber,String airline,int capacity,int seatsBooked){
        this.flightNumber=flightNumber;
        this.airline=airline;
        this.capacity=capacity;
        this.seatsBooked=seatsBooked;
    }

    public static void main(String[] args) {
        Flight f=new Flight(1552,"Dolphin",500,252);
        System.out.println(f.getFlightDetails());
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSeatsBooked() {
        return seatsBooked;
    }
}
