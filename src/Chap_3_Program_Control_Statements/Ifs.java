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

        //If else-if ladder
        int x;
        for (x = 0;  x< 6; x++) {
            if (x==1){
                System.out.println("X = 1");
            } else if (x==2) {System.out.println("X = 2");
            } else if (x==3) {System.out.println("X = 3");
            } else if (x == 4) {System.out.println("X = 4");}
            else {System.out.println(( "X is greater than 4"));
            }
        }
    }
}
