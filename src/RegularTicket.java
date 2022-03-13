import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class RegularTicket extends Ticket {
    private boolean food;
    private boolean water;
    private boolean snacks;
    RegularTicket(int pnrNumber, String departure, String destination, String flightName, LocalDate dateOfDeparture, LocalTime timeOfDeparture, LocalDate dateOfArrival, LocalTime timeOfArrival, int seatNumber, float priceOfTicker, String hotelAddress,boolean food,boolean water,boolean snacks){
        super(pnrNumber,departure, destination,flightName,dateOfDeparture, timeOfDeparture, dateOfArrival, timeOfArrival,seatNumber,priceOfTicker);
    }



    // this extra method is to make code simple understandable but does not belong to main methods
    private void validateService(String item){
        if(item=="food" || item=="Food"){
            this.food=true;
        }
        else if(item=="water" || item=="Water"){
            this.water=true;
        }
        else if(item=="snacks" || item=="Snacks"){
            this.snacks=true;
        }

    }
    // implementaion of main methods

    public String specialServicesAvailed(){
        String servicesRequested="";
        if(food==false && water==false && snacks==false){
            return "No Special Services Available";
        }
        else{
            if(food==true){
                servicesRequested=servicesRequested+"Food ";
            }
            if(water==true){
                servicesRequested=servicesRequested+"Water ";
            }
            if(snacks==true){
                servicesRequested=servicesRequested+"Snacks ";
            }
        }
        servicesRequested=servicesRequested+"services availed";
        return servicesRequested;
    }
    // Below three  methods demonstrating method overloading so consider this as one method
    public void updateSpecialServices(String food){
        validateService(food);

    }
    public void updateSpecialServices(String food,String water){
        validateService(food);
        validateService(water);

    }
    public void updateSpecialServices(String food,String water,String snacks){
        validateService(food);
        validateService(water);
        validateService(snacks);

    }
    //     main method for testing purpose
    public static void main(String[] args){
        LocalTime toa1 = LocalTime.of(10,43,12);
        LocalTime tod1 = LocalTime.of(2,9,15);
        LocalDate doa1 = LocalDate.of(2017, 1, 13);
        LocalDate dod1 = LocalDate.of(2017, 1, 14);
        RegularTicket rt=new RegularTicket(1001, "chennai","washington","Qatar Airways", dod1,tod1, doa1, toa1, 15, 45664,"Hilton Garden Inn Reagan National Airport,Washington, District of Columbia, United States of America",true,true,true);
        rt.updateSpecialServices("food");
        System.out.println(rt.specialServicesAvailed());
        rt.updateSpecialServices("water","snacks");
        System.out.println(rt.specialServicesAvailed());

    }


}
