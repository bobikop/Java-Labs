package day01_JavaLabs;

public class UserRegister {
    public static void main(String[] args) {
        String firstName = "Mike";
        String lastName = "Smith";
        String monthOfBirth = "May";
        int dateOfBirth = 10;
        int yearOfBirth = 1980;

        boolean isHealthPlanId = true;
        boolean isSSNumber = false;

        int memberId = 123445;
         long policyNumber = 121321365823l;

        int last6DigitsOfSsn = 100000;
        String zipCode = "22102";

        System.out.println(firstName + " who born in " + monthOfBirth +
                " wants health insurance from United with policy number " + policyNumber);


    }
}
