public class Method {
    public static void main(String[] args) {
//          printf() = is a method used to format output

//          %[flags][width][.precision][specifier-character]

        String name = "Batman";
        char firstLetter = 'B';
        int age = 35;
        double height = 188.00;
        boolean isEmployed = false;

//        Without Precision : -

        System.out.printf("Hello %s\n",name);
        System.out.printf("Your name starts with a %c\n",firstLetter);
        System.out.printf("You are %d years old\n",age);
        System.out.printf("You are %f cm tall\n", height);
        System.out.printf("Employed : %b\n",isEmployed);
        System.out.printf("%s is %d years old\n",name,age);

//        With Precision : -

        double price1 = 9000.99;
        double price2 = 100000.15;
        double price3 = -54000.01;

        System.out.printf("%.2f\n",price1);
        System.out.printf("%.2f\n",price2);
        System.out.printf("%.2f\n",price3);

//        Flags : -

//        + = output a plus
        System.out.printf("%+.2f\n",price1);
        System.out.printf("%+.2f\n",price2);
        System.out.printf("%+.2f\n",price3);
//        , = comma grouping separator
        System.out.printf("%,.2f",price1);
        System.out.printf("%,.2f",price2);
        System.out.printf("%,.2f",price3);
//        ( = negative numbers are enclosed in ()
        System.out.printf("%(.2f\n",price1);
        System.out.printf("%(.2f\n",price2);
        System.out.printf("%(.2f\n",price3);
//        space = display a minus if negative, space if positive
        System.out.printf("% .2f\n",price1);
        System.out.printf("% .2f\n",price2);
        System.out.printf("% .2f\n",price3);

//        Width : -

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

//        0 = zero padding
        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);
//       number = right justified padding
        System.out.printf("%4d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("%4d\n",id3);
        System.out.printf("%4d\n",id4);
//        negative number  = left justified padding
        System.out.printf("%-4d\n",id1);
        System.out.printf("%-4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%-4d\n",id4);



    }
}
