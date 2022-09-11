package Chap_1_If_Blocks_For_Table;

public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 3;
        if ( a < b ) System.out.println("a is less than b");
        System.out.println();
        //this wont display as it is not equal
        if (a == b ) System.out.println("this should not be displayed");
        System.out.println();
        c = b - a; //c = 1
        System.out.println("c contains 1");
        if (c >= 0) System.out.println("c is not negative");
        if (c < 0) System.out.println("c is negative");
        System.out.println();
        c = a - b; //c = -1, see how you can change it as it flows downward. Java works top to bottom
        System.out.println("c contains -1");
        if (c >= 0) System.out.println("c is not negative");
        if (c < 0) System.out.println("c is negative");
        System.out.println();


    }

}
