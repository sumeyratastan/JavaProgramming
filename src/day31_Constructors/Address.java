package day31_Constructors;

public class Address {

    public String buildingNumber,street,city,state,zipCode;

    public Address(String buildingNumber, String street, String city, String state, String zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return buildingNumber+" "+street+"\n"+city+" "+state+" "+zipCode;
    }

    public static void main(String[] args) {
        Address address1=new Address(22+"","wimborne close","epsom","surrey,",16254+"");
        System.out.println(address1);
    }






}
/*
2. Address Task:
2.1 Create a class named Address
    Attributes:
         buildingNumber, street, city, state,
zipCode;
   Add a constructor to set all the fields
    Actions
            toString: returns the address
                        EX:

7925 Jones Branch Dr

McLean Va, 22012
 */