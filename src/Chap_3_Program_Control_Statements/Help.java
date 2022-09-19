package Chap_3_Program_Control_Statements;

public class Help {
    public static void main(String[] args) throws java.io.IOException{
        System.out.println("Help on:\n1. if\n2. switch\nChoose one:");
        char choice = (char) System.in.read();
        switch (choice){
            case '1':
            System.out.println("The if:\nif(condition)");
            System.out.println("statement");
            break;
            case '2':
            System.out.println("The Switch\nswitch(expression[a previously declared variable]) {");
            System.out.println("case constant : ");
            System.out.println("statement sequence");
            System.out.println("break");
            System.out.println("  //.....");
            System.out.println("}");
            break;
            default:
                System.out.println("Selection not available");
        }

        }
        }



