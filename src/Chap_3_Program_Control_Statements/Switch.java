package Chap_3_Program_Control_Statements;

import javax.swing.*;

public class Switch {
    public static void main(String[] args) {
        //Demonstrate switch
        //switch (expression) {
        //case constant1: statement sequence
        //break;

        int i;
        /*for (i = 0; i < 10; i++)
            switch (i){
            case 0 : System.out.println("I = 0");
            break;
            case 1 : System.out.println("I = 1");
            break;
            case 2 : System.out.println("I = 2");
            break;
            case 3 : System.out.println("I = 3");
            break;
            case 4 : System.out.println(("I = 4"));
            break;
                default: System.out.println("I is 5 or more");
                break;*/
        //Demonstrate why breaks are important in switch statements
        //if you dont include them it will run through the sequence as many times as is specified in the loop

        for (i = 0; i <= 5; i++)
            switch (i) {
                   /*case 0 : System.out.println("I is less than 1");
                    case 1 : System.out.println("I is less than 2");
                    case 2 : System.out.println("I is less than 3");
                    case 3 : System.out.println("I is less than 4");
                    case 4 : System.out.println("I is less than 5");
                }
                System.out.println();*/

                case 1 :
                    break;
                case 2 :
                    break;
                case 3 : System.out.println("I is 1, 2 or 3");
                    break;
                case 4 : System.out.println("I = 4");
                    break;
                case 5 : System.out.println("I >= 5");
                    break;

            }


    }
}



