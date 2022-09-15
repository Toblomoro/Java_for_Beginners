package Chap_3_Program_Control_Statements;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args)
        throws java.io.IOException{
            char ch;
            System.out.println("Press a key followed by ENTER: ");
            ch = (char) System.in.read();
            System.out.println(" Your key is : " + ch);
        }
      /*  Scanner input;
        input = new Scanner(System.in);
        System.out.println("Will you please input a char: ");
        String chr = input.next();
        System.out.println(( "Your character is : " +chr));*/


    }

