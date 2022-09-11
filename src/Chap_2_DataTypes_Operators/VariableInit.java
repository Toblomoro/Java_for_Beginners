package Chap_2_DataTypes_Operators;

public class VariableInit {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3 ; x++) {
            int y = -1; // y is intiialized each time the for loop is used.
            System.out.println(" y is " +y); //this i will always print y = -1
            y = 100;
            System.out.println(" y is now "+y);
            //it now prints y is now 100. It prints 3 time because the for loop builds to 3, if we changed x to 2 it would only print once.
            //this shows how y is reset each time the loop is called. See as it comes back to -1 each time rather than accumulating on its self

        }
    }
}
