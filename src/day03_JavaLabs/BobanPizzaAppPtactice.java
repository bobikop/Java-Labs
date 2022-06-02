package day03_JavaLabs;

import java.util.Scanner;

public class BobanPizzaAppPtactice {
    public static void main(String[] args) {

        System.out.println(" Welcome to Best Pizza in Town");
        System.out.println("Please log in before placing the order");

        // Create three variables email(string), account number(int), password and assign value
        String email = "mike@gmail.com";
        int accountNumber = 123;// account number can be between > 100 and < 1000
        String password = "password";

        // Ask customer if he/she wants to log in with email(1) or account number(2);
        String logIn;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please chose your log in type. Email:1, Account NUmber: 2");
        int loginType = scan.nextInt();

        for (int i = 3; i >0 ;) { // this will create infinity loop


            // create the selection flow for the log in type

            switch (loginType) {
                case 1: // if I chose log in type 1 (which is email) this portion case 1 should do credential check
                    // Enter your email (ask user to enter email)
                    System.out.println("Enter your email");
                    String givenEmail = scan.next();

                    // Check if the email address is valid: // if @ . available, and @ is before .

                    int firstSignOfIndex = givenEmail.indexOf('@');
                    int secondSignOfIndex = givenEmail.indexOf(".");

                    boolean checkEmail = secondSignOfIndex < firstSignOfIndex || firstSignOfIndex < 0 || secondSignOfIndex < 0;

                    if (checkEmail) {
                        System.out.println("Invalid Email Address");
                        continue;
                    }

                    // Check if domain is valid// gmail and hotmail domain ----- mike@gmail.com

                    String domain = givenEmail.substring(givenEmail.indexOf('@') + 1, givenEmail.indexOf('.'));        //gmail
                    boolean checkDomain = domain.equalsIgnoreCase("gmail") || domain.equalsIgnoreCase("hotmail");


                    if (!checkDomain) {  // this is the second option to check domain
                        System.out.println("Invalid domain");
                        continue;
                    }

                    // Write the code (enter your password)
                    System.out.println("Enter your password");
                    String givenPassword = scan.next();

                    // Check if log in successful

                    if (email.equals(givenEmail) && password.equals(givenPassword)) {
                        System.out.println("Successfully log in");
                        break;
                    } else {
                        if (i != 1 ){ // if we reach third attempt will work
                            System.out.println("Invalid credentials!! left " + (i -1 + " chances to try"));
                            i--;
                            continue; // do not execute anything after this point, go back to for loop
                        // break ---stop the loop here and exist the loop
                        // return ---stop the method that you are inside
                        }else{
                            System.out.println("Your account is locked - try again tomorrow");
                            System.exit(0); // close the execution of JVM
                        }
                    }

                case 2:
                    System.out.println("Account number log in chosen");
                    break;

            }
            break;// stop for loop
        }

    }
}




