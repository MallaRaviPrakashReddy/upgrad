import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
//        initializing dummy dates and times using localtime and localdate inbuilt classes for testing purposes
        LocalTime toa1 = LocalTime.of(10,43,12);
        LocalTime tod1 = LocalTime.of(2,9,15);
        LocalTime toa2 = LocalTime.of(8,23,01);
        LocalTime tod2 = LocalTime.of(14,55,30);
        LocalDate doa1 = LocalDate.of(2017, 1, 13);
        LocalDate dod1 = LocalDate.of(2017, 1, 14);
        LocalDate dod2 = LocalDate.of(2021, 7, 18);
        LocalDate doa2 = LocalDate.of(2021, 7, 17);

//        dummy dates and times initilize over starting testing

        Ticket rt=new RegularTicket(1001,"madhu","87458963512","madhu@gmail.com","gurnath","TDP","AP", "chennai","washington","Qatar Airways", dod1,tod1, doa1, toa1, 15, 45664,"Hilton Garden Inn Reagan National Airport,Washington, District of Columbia, United States of America",true,true,true);
        Ticket tt=new TouristTicket(2005,"raghu","8745892891","Raghu@gmail.com","gurnath","TDP","AP", "mumbai", "washington", "Dolphin Airways", dod2,tod2,doa2, toa2,27, 52254,"ARC HOTEL Washington DC, Georgetown");
        printTicketDetails(rt);
        printTicketDetails(tt);
        System.out.println("\nTicket Type: Regular Ticket\n"+rt.ticketDetails()+"\n");
        System.out.println("Ticket Type: Tourist Ticket\n"+tt.ticketDetails());



    }
    public static void printTicketDetails(Ticket ticket){
        System.out.println("PNR Number: "+ticket.getPnrNumber());
    }

}
