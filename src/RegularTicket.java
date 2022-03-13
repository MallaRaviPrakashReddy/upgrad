import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class RegularTicket{
    private boolean food;
    private boolean water;
    private boolean snacks;


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

        RegularTicket rt=new RegularTicket();
        rt.updateSpecialServices("food");
        System.out.println(rt.specialServicesAvailed());
        rt.updateSpecialServices("water","snacks");
        System.out.println(rt.specialServicesAvailed());

    }
}
