public class Passenger {
    private static int idCounter;
    private static Address address;
    private static Contact contact;


    Passenger(){
        address=new Address();
        contact=new Contact();
        idCounter++;
    }

    public String getAddressDetails() {
        return address.getAddressDetails();
    }

    public void setAddress(Address address) {
        Passenger.address = address;
    }

    public String getContactDetails() {
        return contact.getContactDetails();
    }

    public void setContact(Contact contact) {
        Passenger.contact = contact;
    }

    public static void main(String[] args) {

        Passenger p=new Passenger();
        Address a=new Address("gurunagar","tirupati","AP");
        p.setAddress(a);
        Contact c=new Contact("kiran","7845129632","kiran@gmail.com");
        p.setContact(c);

        System.out.println("Adress Details: \n"+p.getAddressDetails()+"\n");
        System.out.println("Contact Details: \n"+p.getContactDetails()+"\n");
    }

    private static class Address {
        private String street;
        private  String city;
        private  String state;
        Address(){}
        Address(String street,String city,String state){
            this.street=street;
            this.city=city;
            this.state=state;
        }

        public String getAddressDetails(){
            return "Street: "+street+"\n City: "+city+"\n State: "+state;

        }
        public void updateContactDetails(String street,String city,String state){
            this.street=street;
            this.city=city;
            this.state=state;
        }


        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
    private static class Contact {
        private String name;
        private String phoneNumber;
        private String emailId;

        Contact(){}
        Contact(String name,String phoneNumber,String emailId){
            this.name=name;
            this.phoneNumber=phoneNumber;
            this.emailId=emailId;
        }

        public String getContactDetails(){
            return "Name: "+name+"\n phoneNumber: "+phoneNumber+"\n Email Id: "+emailId;

        }
        public void updateContactDetails(String name,String phoneNumber,String emailId){
            this.name=name;
            this.phoneNumber=phoneNumber;
            this.emailId=emailId;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }
    }


}
