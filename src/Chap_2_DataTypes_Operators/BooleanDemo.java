package Chap_2_DataTypes_Operators;

public class BooleanDemo {
    public static void main(String[] args) {
        //Boolean represents a true/false value.
        boolean b;//create boolean variable
        b = false;//declare its value as false
        System.out.println("b is currently " + b);//this is showing how b represents false and prints as such.
        b= true;
        System.out.println("b is currently " + b);

       if (b) System.out.println("Be is true!"); //you can see since b is true it will print
       b = false;//now when i make it false i have to use a double negative with ! in order for it to print, remove the ! and be is false so it wont print.
        if (b)  System.out.println("This wont print because b us false");
       if (!b)  System.out.println("Be is false...!");
       //However a really important thing a boolean can do is control if statements, by true creating actions and false nto doing such.
        System.out.println("10 > 9 is " + (10 > 9));//this shows how you can use a different math equation (that is true) to make a boolean as well.


    }
}
