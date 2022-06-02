package day05_JavaLab;

public class Revese {
    public static void main(String[] args) {


        String word = "Wooden Spoon";

        String result ="";
        for (int i = word.length() - 1; i >= 0; i--){ // i: index number of the string(word) starting form the last to the first character
            char each = word.charAt(i);
            result += each;


        }
        System.out.println(result);
    }
}
