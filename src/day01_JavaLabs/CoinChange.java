package day01_JavaLabs;

public class CoinChange {
    public static void main(String[] args) {
        int priceInCents = 65;
        int change = 100 - priceInCents;

        int quarter = change / 25;
        int dime = (change % 25) / 10;
        int nickle = ((change % 25) % 10) / 10;


        System.out.println("quarter: " + quarter + " dimes: " + dime + "nickles " + nickle);







    }
}
