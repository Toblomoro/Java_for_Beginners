package Chap_3_Program_Control_Statements;

import java.io.IOException;

public class Ifs {
    public static void main(String[] args)
            throws IOException {
        //Guess the letter game
        char ch, answer = 'k';

        System.out.println("I'm thinking of a letter.\nCan you guess it?");
        ch = (char) System.in.read();
        if (ch == answer)
            System.out.println("**CORRECT**");
        else System.out.println("**INCORRECT**");
    }
}
