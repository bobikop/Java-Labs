package day02_JavaLabs;

import java.util.Scanner;

public class TrainBookingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you have a bag? (Yes: true, No: false");
       boolean hasBag =  scanner.hasNextBoolean();

        System.out.println("Direct transport only? (Yes: true, No: false");
        boolean nonStop =  scanner.hasNextBoolean();

        System.out.println("Chose your travel type (Train:1, Bus:2, Flight:3");
        int transportType = scanner.nextInt();

        System.out.println("From:");
        String from = scanner.next();

        System.out.println("To:");
        String destination = scanner.next();


        String train1 = "TR001";
        String train2 = "TR002";
        String train3 = "TR003";
        String train4 = "TR004";
        String bus1 = "BS001";
        String bus2 = "BS002";
        String bus3 = "BS003";
        String bus4 = "BF004";
        String flight1 = "FL001";
        String flight2 = "FL002";
        String flight3 = "FL003";
        String flight4 = "FL004";


        if(!(from.equalsIgnoreCase("Berlin") && destination.equalsIgnoreCase("Amsterdam"))){
            System.out.println("For now, we can only serve you Berlin - Amsterdam transportation. please change your destinations");
            return; // stop JVM
        }

        switch(transportType){
            case 1:
                if (nonStop && hasBag){
                    System.out.println("You can take " + train3);
                    return;
                } else if (!nonStop && hasBag) {
                    System.out.println("You can take " + train4);
                    return;

                }else if (nonStop && !hasBag){ //verbose code
                    System.out.println("You can take " + train4);
                }
                System.out.println("You can take " + train1 + train2 + train3 + train4);
                break;

            case 2:
                System.out.println("You can take " + bus1 + bus2 + bus3 + bus4);
                break;
            case 3:
                if(nonStop && hasBag){
                    System.out.println("Could not find any flight for you - please check your filters abd retry");
                    return;
                }else if (!nonStop && hasBag){
                    System.out.println("You can take " + flight1);
                    return;
                } else if (nonStop && !hasBag) {
                    System.out.println("You can take " + flight2);
                    return;

                }else{
                    System.out.println("You can take " + flight3);
                }
                break;
            default:
                System.out.println("Invalid transportation type");

        }
    }
}
