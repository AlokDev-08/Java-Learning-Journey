import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {

//        Shopping Cart Program

        String item ;
        double price;
        double quantity;
        char currency ='$';

        Scanner sc = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");
        item = sc.nextLine();
        System.out.print("What is the price for each?: ");
        price = sc.nextDouble();
        System.out.print("How many would you like?: ");
        quantity = sc.nextDouble();

        double total = price * quantity;

        System.out.println( "You have bought "+quantity+" "+item+"/s");
        System.out.println("Your total is "+currency+total);
     


    }
}
