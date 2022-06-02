package day05_JavaLab;

public class TestStringObjects {
    public static void main(String[] args) {

        String str1 = new String("Java"); // creating string object by new keyword

        String str2 = "Java"; // this is creating string object by string literal

        String str3 = new String("Java");
        String str4 = "Java";

        System.out.println(str1 == str2); // false

        System.out.println(str2 == str4); // true

        System.out.println(str1 == str3); // false since are created by new keyword

        System.out.println(str1.equals(str2)); // when need to check the object value need to always use equals method


    }
}
