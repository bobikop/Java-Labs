package day01_JavaLabs;

public class SwapNumbers {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        // option 1  by using third variable

        int n3 = 0;
        n3 = n1; // n1=10  n2=20 n3=10
        n1 = n2; // n1= 20  n2= 20 n3=10
        n2 = n3; // n1=10  n2= 10 n3= 10

        // option 2 (by not using 2nd variable) can be done with aritmetic operators)

        n2 = n1 + n2; // n1= 10 n2 = 30
        n1 = n2 - n1;  // n1 = 20 n2= 30
        n2 = n2 - n1;   // n1 =20 n2 =10


        System.out.println(n1);//20
        System.out.println(n2);//10


    }

}
