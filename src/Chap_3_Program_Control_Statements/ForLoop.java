package Chap_3_Program_Control_Statements;

public class ForLoop {
    public static void main(String[] args) throws java.io.IOException {
//Square root program using a for loop.
        //        double num, sroot, rerr;
//        for (num = 1.0; num < 100.0; num++) {
//            sroot = Math.sqrt(num);
//            System.out.println("Square root of " +num+ " is "+sroot);
//            //compute roundign error
//            rerr = num - (sroot*sroot);
//            System.out.println("Rounding error is " +rerr);
//            System.out.println();
//        }
//    }
//        //using a comma in a for loop
//
//        int i, j;
//        for (i = 0, j = 10; i < j ; i++, j--) {
//            System.out.println(" i and j: "+i+ " and "+j);
//        }
//
//        }
//Loop until S is typed
//    int i;
//    System.out.println("Press S to stop.");
//        for ( i = 0; (char) System.in.read() != 'S'; i ++) {
//            System.out.println("Pass #" +i);
//
//        }
//
//It is possible to leave certian parts of the for loop empty
//        int i;
//        for (i = 0; i < 10;){
//            System.out.println("Pass #" + i);
//            i++;
//        }
//Loops dotn need a body either
int i;
int sum = 0;
//sum of numbers 1-5
        for ( i = 1; i <=5 ; sum += i++); //no bdy in this loop
            System.out.println("Sum is "+ sum);


    }
}
