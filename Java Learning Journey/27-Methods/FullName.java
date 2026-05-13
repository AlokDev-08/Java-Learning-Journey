import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first name : ");
        String first = sc.next();
        System.out.print("Enter the last name : ");
        String last = sc.next();

        String fullName = getFullName(first ,last);
        System.out.println(fullName);

    }
    static String getFullName(String first, String last){
        return(first + " "+last);
    }
}
