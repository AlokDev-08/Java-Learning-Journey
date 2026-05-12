import java.util.Scanner;

public class whileLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        while (age<0){
            System.out.println("Your age can't be negative!");
            System.out.print("Enter your age : ");
            age = sc.nextInt();
        }
        System.out.println("Your age is "+age);
        sc.close();
    }
}