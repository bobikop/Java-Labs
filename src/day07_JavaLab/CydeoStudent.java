package day07_JavaLab;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public boolean isEmployed;
    public boolean isMarried;
    public String batch;
    public int groupNumber;
    public String programingLanguage;

    public void setInfo(String name, int age, char gender, boolean isEmployed, boolean isMarried, String batch, int groupNumber, String programingLanguage) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isEmployed = isEmployed;
        this.isMarried = isMarried;
        this.batch = batch;
        this.groupNumber = groupNumber;
        this.programingLanguage = programingLanguage;
    }
    // Sets all the fields
    public void study(){
        System.out.println(name + " is studying " + programingLanguage);
    }

    // display the student info wehn objects are passed in print statement
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", batch='" + batch + '\'' +
                ", programingLanguage='" + programingLanguage + '\'' +
                '}';
    }
}
/*

1. Create a custom class for CydeoStudent objects.
1. In each object, user should be able to store the name, age, gender,
isMarried, isEmployeed, batch, programming language, and group
number information of the Cydeo student
2. Add a function named setInfo that allows the user to be able to
set all the fields of the Cydeo student
3. Add a function named study that can print the name and
programming language the student studying
4. Add a function that allows the user to be able to display each
objects’ name, age, gender, batch and programming language of
the student when it’s passed in the print statement
 */
