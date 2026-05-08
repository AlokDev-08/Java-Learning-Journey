import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {

//    This will generate any number between -2 billion to +2 billion.
        Random r = new Random();

        int num =r.nextInt();
        System.out.println(num);

//        Dice Roll
        int dice = r.nextInt(1,6); //       1 is Included while 6 is Excluded
        System.out.println(dice);

//        Head or Tails, Coin Toss

        Boolean isHead;
        isHead =r.nextBoolean();
        if (isHead){
            System.out.println("It is Head!");
        }
        else{
            System.out.println("It is Tail!");
        }
    }
}
