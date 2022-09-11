package Chap_2_DataTypes_Operators;

import com.sun.tools.javac.Main;

public class ArithmiticOperators {
    public static void main(String[] args) { //Modulus is the remainder when things dotn dived wholly. SO 10 mod 3 = 1 because 10/3 - 3 r 1
        System.out.println(" -- DEMONSTRATING MODULUS REMAINDER AND RESULTS DIFFERENCE -- ");
        int iresult, irem;
        double dresult, drem;

        iresult = 10 /3;
        irem = 10 % 3;

        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;

        System.out.println(" Result and remainder for 10 /3 (using int)= \n Result : "+ iresult + "\n Remainder : " +irem);
        System.out.println(" Result and remainder for 10.0 /3.0 (using doubles) = \n Result : "+ dresult + "\n Remainder : " +drem);
        System.out.println(" -- DEMONSTRATING RELATIONAL AND LOGICAL OPERATORS -- ");
//Demonstrating relational and logical operators.
        int i, j;
        boolean b1, b2;

        i = 10;
        j = 11;
        if (i < j) System.out.println(" i < j");
        if (i <= j) System.out.println(" i <= j");
        if (i != j) System.out.println(" i != j");
        if (i == j) System.out.println(" i == j this wont execute unless i or j is modified");
        if ( i >= j) System.out.println(" i >= j this wont execute unless i or j is modified");
        if ( i > j) System.out.println(" i > j this wont execute unless i or j is modified");

        b1 = true;
        b2 = false;
        if (b1 & b2) System.out.println("this wont execute and it equals false and false dotn print");
        if (!(b1 & b2)) System.out.println("!(b1 & b2) = true so it prints!");
        if ((b1 | b2)) System.out.println("(b1 | b2) = true so it prints!");
        if ((b1 ^ b2)) System.out.println("(b1 ^ b2) = true so it prints!"); //^ is XOR exclusive OR

        System.out.println(" --- SHORT CIRCUIT LOGICAL OPERATORS -- ");

        int n, d, q;

        n = 10;
        d = 2;
        if(d != 0 & (n % d) == 0) System.out.println( d + " is a factor of " + n); // checked by ensureign d does NOT = 0 and that it is divisible evenly by n (because n / d's remainder will == 0.
        d = 0;
        //since d is now set to 0 the next part wont evaluate and will cause an error because returns false.
       //if(d != 0 & (n % d) == 0) System.out.println( d + " is a factor of " + n);
// if we use short circut operators && || it will evalute both and nto flip an error becasue it evaluates the first one and it returns false so it just skips the error causign modulus
        if(d != 0 && (n % d) == 0) System.out.println( d + " is a factor of " + n);
        d = 0;

        if(d != 0 && (n % d) == 0) System.out.println( d + " is a factor of " + n);
    }
}
