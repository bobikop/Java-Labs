package day07_JavaLab;

public class Address {


    public String buildingNumber; // this is creates as instance variable since no all building will have same building number
    public String street; // also instance variable
    public String city;
    public String state;
    public String zipCode;
   // public static String country = "USA"; // since that all the customers will be placed in USA then we use static instead instance variable


    public void setInfo(String buildingNumber, String street, String city, String state, String zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    public String toString(){
        return  buildingNumber + " " + street + " " + "\n" + city + ", " + state + " " + zipCode;
    }













}
/*
1. Create a custom class for Address objects.
1. In each object, user should be able to store the building number,
street, city, state, and zip code information of the address
2. Add a function named setInfo that allows the user to be able to
set all the fields of the address object
3. Add a function that allows the user to be able to display each
objects’ shipping address when it’s passed in the print statement
 */