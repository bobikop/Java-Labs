package day07_JavaLab;

public class TestSydeoStudent {
    public static void main(String[] args) {


        CydeoStudent cydeoStudent1 =  new CydeoStudent();
        cydeoStudent1.setInfo("Boban", 40, 'M', true, true, "Java Developer batch 1", 7, "Java");
        CydeoStudent cydeoStudent2 =  new CydeoStudent();
        cydeoStudent2.setInfo("hasan", 23, 'M', true, false, "Java Developer batch 1", 7, "Java");

        CydeoStudent cydeoStudent3 = new CydeoStudent();
        cydeoStudent3.setInfo("Daniel", 28, 'M', false, true, "Java SDET", 15, "Java");



        System.out.println(cydeoStudent1);
        System.out.println(cydeoStudent2);
        System.out.println(cydeoStudent3);

        System.out.println("-----------------------------------------");

        CydeoStudent student1 =  new CydeoStudent();
        CydeoStudent student2 =  student1;
        CydeoStudent student3 = student2;

        student1.setInfo("Boban", 40, 'M', true, true, "Java Developer batch 1", 7, "Java");

       // one object can be referenced by multiple reference variable
        // one reference variable can ONLY reference to one object

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);





    }
}
