package day08_09JavaLab;

import java.util.ArrayList;
import java.util.Scanner;

public class SplitApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Budget Planner!");

        System.out.println("How many people will split the budget");






    }

    public static ArrayList<User> prepareUserList(Scanner scanner){

        ArrayList<User> userList = new ArrayList<>();

        int userCount = scanner.nextInt();
        for (int i = 0; i < userCount; i++) {

            // no idea what is this

            User user = new User();

            System.out.println("Name: ");
            user.name = scanner.next();

            System.out.println("Email: ");
            user.email = scanner.next();

            userList.add(user);
        }

             return userList;

    }


}
