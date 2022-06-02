package day05_JavaLab;

public class StringMethodsPractice {

    public static void main(String[] args) {

        // charAt() method for getting character of the string
        String name2 = "Sydeo School";
        String name = "Boban Milosevic";
               //      0123456789101112131415

       char ch = name.charAt(4);
        System.out.println(ch);

        System.out.println(name.length() ); // to find the last index number we need to substrate 1

        char lastChar = name.charAt(name.length() - 1);
        //char lastChar = name.charAt()
        System.out.println(lastChar);


        // what if we want  to display each character of any string
        System.out.println("---------------------------------");

        String school = "Cydeo School";

        int index1 = school.indexOf('e');

        System.out.println(index1);

        int index2 = school.indexOf('j');

        System.out.println(index2);


        String str1 = "Java Programming Language";

        int index3 = str1.indexOf("a ");

        System.out.println(index3);

        System.out.println("-----------------------------------------------------------");


        String s1 = "WOODEN SPOON";

        s1 = s1.toLowerCase(); //"wooden spoon"

        System.out.println(s1);

        s1 = s1.toUpperCase();  //"WOODEN SPOON"

        System.out.println(s1);

        System.out.println("-----------------------------------------------------------");

        String sentence = "Today is Thursday, and Thursday is a lab day";

        sentence = sentence.replace("Thursday", "Friday");

        System.out.println(sentence);

     System.out.println("-----------------------------------------------------------");

     String s = "Today is Thursday, and tomorrow is Thursday";

     s = s.replaceFirst("Thursday", "Wednesday");

     System.out.println(s);



     System.out.println("-----------------------------------------------------------");

     String email = "sydeo_school@hotmail.com";








    }
}
