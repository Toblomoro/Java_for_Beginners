package Chap_2_DataTypes_Operators;

import com.sun.tools.javac.Main;

public class ScopeDemo {
    public static void main(String[] args) {
        int x; //is going to be known in all areas of main

        x = 10;
        if (x == 10) {//START NEW SCOPE
            int y = 20; // known only in this block
            System.out.println("X and Y : X = " + x + " Y = " + y);
            x = y * 2;
        }
        //int y = 100 will not work as it is outside fo the scope
        System.out.println("X is now "+ x + " because of he ending formula.");
    }
}
