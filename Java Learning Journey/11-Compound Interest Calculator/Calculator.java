import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double totalAmount;

        System.out.print("Enter the principal amount : ");
        principal = sc.nextDouble();
        System.out.print("Enter the interest rate (in %) : ");
        rate = sc.nextDouble()/100;
        System.out.print("Enter the no. of times compounded per year : ");
        timesCompounded = sc.nextInt();
        System.out.print("Enter the no. of years : ");
        years = sc.nextInt();

        totalAmount = principal*Math.pow(1 +rate/timesCompounded,years*timesCompounded);
        System.out.printf("The amount after %d years is $%.2f",years,totalAmount);

        sc.close();
    }
}
