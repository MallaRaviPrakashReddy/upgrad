class Address {
    private String street;
    private  String city;
    private  String state;
    Address(){}
    Address(String street,String city,String state){
        this.state=state;
        this.street=street;
        this.city=city;
    }

    public String getAddressDetails(){
        return "Street: "+street+"\nCity: "+city+"\nState: "+state;

    }
    public void updateContactDetails(String street,String city,String state){
        this.street=street;
        this.city=city;
        this.state=state;
    }

    public static void main(String[] args) {
        Address ad=new Address("trinare Steet","tirupati","AP");
        System.out.println(ad.getAddressDetails());
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



