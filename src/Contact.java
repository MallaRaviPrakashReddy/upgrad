public class Contact {
    private String name;
    private String phoneNumber;
    private String emailId;

    public String getContactDetails(){
        return "Name: "+name+"\nphoneNumber: "+phoneNumber+"\nEmail Id: "+emailId;

    }
    public void updateContactDetails(String name,String phoneNumber,String emailId){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.emailId=emailId;
    }
    Contact(){}
    Contact(String name,String phoneNumber,String emailId){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.emailId=emailId;
    }
    public static void main(String[] args) {
        Contact c=new Contact("arun","9988238574","arun@gmail.com");
        System.out.println(c.getContactDetails());
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

