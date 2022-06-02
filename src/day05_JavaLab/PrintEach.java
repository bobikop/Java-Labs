package day05_JavaLab;

import java.util.Scanner;

public class PrintEach {
    public static void main(String[] args) {



        String word = new Scanner(System.in).nextLine(); // only need one time scanner and then will be taken by garbage collector

        for (int i = 0; i <= word.length() -1; i++) {
            char each = word.charAt(i);
            System.out.print(each);
        }












    }
}
