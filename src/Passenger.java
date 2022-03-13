public class Passenger {
    private static int idCounter;


    Passenger(){
        Address address=new Address();
        Contact contact=new Contact();
        idCounter++;
    }
}
