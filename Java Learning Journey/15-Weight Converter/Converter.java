import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Weight Converter Program 

        double weight;
        double lbs ;
        double kgs;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = sc.nextInt();

        if(choice==1){
            System.out.print("Enter the weight in lbs: ");
            weight = sc.nextDouble();
            kgs = weight*0.453592;
            System.out.printf("The new weight in kgs is: %.2f",kgs);
        }
        else{
            System.out.print("Enter the weight in kgs: ");
            weight = sc.nextDouble();
            lbs = weight*2.20462;
            System.out.printf("The new weigth in lbs is: %.2f",lbs);
        }
        sc.close();
    }
}
