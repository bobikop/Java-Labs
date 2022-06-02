package day05_JavaLab;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        String sentence = " Java Java Java Java Python C# Java Java";

        int countJava = 0;
        // while loop will run until condition do not become false!!!

        //sentence.indexOf("Java")
        while (sentence.contains("Java")){
            sentence = sentence.replaceFirst("Java", ""); // remove one Java at the time and replace it with empty string. Loop will continue as loon the sentence has Java
            countJava++; // increase number of Java by 1

        }

        System.out.println(countJava);

    }
}
