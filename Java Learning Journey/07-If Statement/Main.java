import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//        if statement = performs a block of code if its condition is true.

        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("What is your name : ");
        name = sc.nextLine();
        System.out.print("What is your age : ");
        age = sc.nextInt();
        System.out.print("Are you a student? (True/False) : ");
        isStudent = sc.nextBoolean();

//        Group 1 :-

        if(name.isBlank()){
            System.out.println("Please enter a valid name...");
        }
        else{
            System.out.println("Hello ! "+name);
        }

//        Group 2 :-
        if(age < 0){
            System.out.println("You have not been born yet!");
        }
        else if(age < 18){
            System.out.println("You are not an adult!");
        }
        else if(age <= 60){
            System.out.println("You are an adult!");
        }
        else{
            System.out.println("You are a senior citizen!");
        }

//        Group 3 :-
        if(isStudent){
            System.out.println("You are a Student!");
        }
        else{
            System.out.println("You're not a Student!");
        }
        sc.close();
    }
}
