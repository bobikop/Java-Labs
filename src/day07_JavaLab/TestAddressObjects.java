package day07_JavaLab;

import java.sql.SQLOutput;

public class TestAddressObjects {
    public static void main(String[] args) {



        Address address1 = new  Address();
        address1.setInfo("15415", "Beachwater Ct", "Dumfries", "VA", "22025");


        Address address2 = new  Address();
        address2.setInfo("1462", "Greenmount Drive", "Springfield", "VA", "22150");

        Address address3 = new  Address();
        address3.setInfo("1515", "Derby Court", "Alexandria", "VA", "22304");


        System.out.println(address1);
        System.out.println(address2);
        System.out.println(address3);

        System.out.println("-----------------------------------------");









    }
}
