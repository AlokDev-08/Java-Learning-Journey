import java.util.Scanner;
public class NestedLoop {
    public static void main(String[] args) {

//        nested loop = A loop inside another loop
//                      Used often with matrices or DSA

        Scanner sc = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the no. of rows : ");
        rows = sc.nextInt();
        System.out.print("Enter the no. of columns : ");
        columns = sc.nextInt();
        System.out.print("Enter the symbol : ");
        symbol = sc.next().charAt(0);

        for(int i = 0 ;i<rows;i++){
            for (int j = 0;j<columns;j++){
                System.out.print(symbol+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
