import java.util.Scanner;

public class Area_Of_Rectangle {
    public static void main(String[] args) {
        //    Calculate Area of rectangle
        Scanner sc = new Scanner(System.in);

        double height;
        double width;
        double area;

        System.out.print("Enter the height of the rectangle: ");
        height =sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width =sc.nextDouble();

        area = height*width;
        System.out.println("The Area of Rectangle is "+area+" cm².");

        sc.close();
    }
}
