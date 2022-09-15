package Chap_2_DataTypes_Operators;

public class CastingDemo {
    public static void main(String[] args) {
        //casting is converting types

        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); // cast double to int
        System.out.println("Integer outcome of x / y : " + i);
        i = 100;
        b = (byte) i; // we didnt need to use parenthese because it it only one variable, the cast only affects the first variable unless it is enclosed.
        System.out.println("Value of b is : " + b); //which will be 100 as a byte cna still hold it
        i = 257;
        b = (byte) i; // this will not work as byte only holds up to 256
        System.out.println("Value of b is : " + b);
        b = 88; //ASCII code for x
        ch = (char) b; // this is cast to incompatible types. SO it finds a way
        System.out.println(" ch : " + ch);

//promotion and casting
        System.out.println(" -- DEMONSTRATING PROMOTION AND USE CAST -- ");

        b = 10; // previously declared as byte
        // i was also previously eclared if you would iek to se it is above the header

        i = b * b; //no cast needed because the result is already being converted to int via i
b = 10;
b = (byte) (b*b); //cast needed to move b back to byte
        System.out.println("i and b : " + i + " " + b);//so both i and be have become 100
int o;
        for (o = 0; o < 5; o++) { //if getting an error already defined n scope realise intellij auto formats with a definition state
            System.out.println(o + " / 3 = "+ o/3);
            System.out.println(o + " / 3 with a fractions and double conversion = " + (double) o /3);
            System.out.println(); // this demonstrates how you may need to convert to not lose data. you can see as int 0 is displayed for .3, .6 etc



        }


    }


}

