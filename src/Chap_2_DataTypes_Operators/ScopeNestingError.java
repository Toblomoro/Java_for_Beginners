package Chap_2_DataTypes_Operators;

public class ScopeNestingError {
    public static void main(String[] args) {
        int count;
        for ( count = 0; count < 10; count++) {
            System.out.println(" This count is "+ count);
            //int count; // cant redeclare with int, i would get teh name error if i left int in the for loop above
            for ( count = 0; count < 2  ; count++) {
                System.out.println("This program will error!");

            }

        }
    }
}
