import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Overloaded Methods = methods that share the same name,
//                             but different parameters
//                             signature  = name + parameters

        System.out.print("Enter the first number : ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number : ");
        double b = sc.nextDouble();
        System.out.print("Enter the third number : ");
        double c = sc.nextDouble();

        double sum = add(a, b, c);
        System.out.println("The sum of three number are : "+sum);

    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }
}
