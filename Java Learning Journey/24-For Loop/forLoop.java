import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

//        For Loop = execute a code for certain amount of time

//        New Year Countdown

        System.out.print("How many seconds you want to countdown from  : ");
        int countDown =sc.nextInt();

        for(int i = countDown;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR!!!");
        sc.close();
    }
}
