package day08_09JavaLab;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBoban {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Budget Planner!");
        // Create user
        // Ask how many people in the budget planner
        System.out.println("How many people will split the budget?");

        // Create User
        ArrayList<User> userList = prepareUserLists(scanner);  // we need to put class name User when creatimg arraylist

        ArrayList<Expense> expenseList = new ArrayList<>();

        System.out.println("Added user count : " + userList.size());

        String[] optionList = prepareUserList();


        while(true){

            System.out.println("What you would like to do?"); // asking user what want to do , show the menu

            for (int i = 0; i < optionList.length; i++) {   // in for loop we are calling prepare userList to get all

                System.out.println(optionList[i] + ":" +i+1);

            }

            int request = scanner.nextInt();
            switch (request){
                case 0:
                    // ask expense name, amount name

                    Expense expense = new Expense();

                    System.out.println("Expense name: ");
                    expense.expenseName = scanner.next();

                    System.out.println("Expense Amount: ");
                    expense.amount =  scanner.nextInt();

                    System.out.println("Which user made this expense? Just type user ID:");


                    // show all users: id : 0 name Ozzy

                   for( User user : userList){
                       System.out.println("id:" + userList.indexOf(user) + "name" + user.name);

                   }

                    int userId = scanner.nextInt();

                    User user = userList.get(userId);

                    expense.user = user.name;

                    expenseList.add(expense);


                    break;
                case 1:

                    //need to show us only specific user expense
                    System.out.println("Please enter user name that you would like to search!");
                    String userName = scanner.next(); // check if user name is from the valid user list

                    User myUser = null; // here we are declaring new variable muUser = null so we can compare it with and if the user is still null will just skip


                    for ( User chosenUser : userList){
                        if (chosenUser.name.equals(userName)){

                            myUser = chosenUser;
                        }

                }
                    if(myUser == null){
                        System.out.println("User not exists!");
                        break;
                    }



                    // List specific Person Expense
                    // 0 - expense amount : 100, expense by :Ozzy
                    // 1 - expense amount : 100, expense by :Ozzy
                    // Ozzy spent $ 200
                    int userExpenseAmount = 0;
                    int expenseCount=0;

                    for (int i = 0; i < expenseList.size(); i++) {
                        if (expenseList.get(i).user.equals(userName)) {

                            userExpenseAmount += expenseList.get(i).amount;
                            expenseCount++;
                            System.out.println(i  + "expense amount:" + expenseList.get(i).amount + ", expense by:" + expenseList.get(i).user);
                        }
                    }

                    System.out.println(myUser + " spent $ " + userExpenseAmount);
                    break;

                case 2:

                    // 0 : expense amount :100,  expense by : ozzy
                    // 1 : expense amount : 30, expense by : ozzy
                    // 2 : expense amount : 20, expense by : mike



                    for(int i = 0; i < expenseList.size(); i++) {
                        System.out.println(i + "expense amount:" + expenseList.get(i).amount + ", expense by:" + expenseList.get(i).user);
                    }

                    break;

                case 3:

                    // split code here

                    ArrayList<Split> splitList = calculateSplitByUser(expenseList);




                    break;
                case 5:
                    System.exit(0);
            }

        }

    }



    public static void makeSplit(double totalAmount, ArrayList<Split> splitList){
        double amount = totalAmount / splitList.size();


        // total 300
        // each person : 100

        for(Split split : splitList){

            if(split.amount > amount) {
                System.out.println(split.userName + " needs to take back " + (split.amount - amount));
            }else{
                System.out.println(split.userName + " need to pay  " + (-1 *(split.amount - amount)));
            }
        }


    }

    public static ArrayList<Split> calculateSplitByUser(ArrayList<Expense> expenseList) {

        ArrayList<Split> splitList = new ArrayList<>();

        for (Expense expense : expenseList) {

            Split split = existSplitList(expense.user, splitList);
            if(split != null){
                split.amount += expense.amount;
            }else{
                Split willbeAdded = new Split();
                willbeAdded.userName = expense.user;
                willbeAdded.amount = expense.amount;
                splitList.add(willbeAdded);
            }


        }




        return splitList;
    }


    public static Split existSplitList(String userName, ArrayList<Split> splitList) {

        for(Split split : splitList){
            if(split.userName.equals(userName)){
                return split;
            }
        }

        return null;

    }




    public static String[] prepareUserList(){

        String []optionList = {"Make Expense", "List Specific Person Expense", "List All Expenses", "Make Split","List All Users", "Close the Budget" };
        return optionList;

        /*
        Creating options
        0 : Make Expense
        1 : List Specific Person Expense
        2 : List All Expenses
        3 : Make Split
        4 : List All Users
        5 : Close the Budget
         */

           // whathever is declared inside of method is not visible from outside
    }

    public static ArrayList<User> prepareUserLists(Scanner scanner){
        ArrayList<User> userList = new ArrayList<>();

        int userCount = scanner.nextInt();

        for (int i = 0; i < userCount; i++) {

            User user = new User();

            System.out.println("Name");
            user.name = scanner.next();

            System.out.println("Email");
            user.email = scanner.next();

            userList.add(user);// put user object to save

        }

        return userList;
    }
}
