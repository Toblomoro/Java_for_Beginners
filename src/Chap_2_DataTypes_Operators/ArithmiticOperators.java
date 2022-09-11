package Chap_2_DataTypes_Operators;

import com.sun.tools.javac.Main;

public class ArithmiticOperators {
    public static void main(String[] args) { //Modulus is the remainder when things dotn dived wholly. SO 10 mod 3 = 1 because 10/3 - 3 r 1
        int iresult, irem;
        double dresult, drem;

        iresult = 10 /3;
        irem = 10 % 3;

        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;

        System.out.println(" Result and remainder for 10 /3 (using int)= \n Result : "+ iresult + "\n Remainder : " +irem);
        System.out.println(" Result and remainder for 10.0 /3.0 (using doubles) = \n Result : "+ dresult + "\n Remainder : " +drem);
    }
}
