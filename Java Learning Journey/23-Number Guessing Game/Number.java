import  java.util.Scanner;
import java.util.Random;

//Number Guessing Game

public class Number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();

        int guess;
        int attempt=0;
        int max = 10;
        int min = 1;
        int random =rm.nextInt(min, max+1);

        System.out.println("<------Number Guessing Game------>");
        do{
            System.out.printf("Enter a number between %d-%d : ",min,max);
            guess =sc.nextInt();
            attempt++;

            if(guess>random){
                System.out.println("Too High!");
                System.out.println("You guessed wrong!,Try Again.");
            }
            else if(guess<random){
                System.out.println("Too Low!");
                System.out.println("You guessed wrong!, Try Again.");
            }
            else {
                System.out.println("Congrats!,You've guessed right.");
                System.out.println("The no. of attempts you have taken is "+attempt);
            }
        }while (guess!=random);

        sc.close();
    }
}