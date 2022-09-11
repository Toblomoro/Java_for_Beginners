package Chap_2_DataTypes_Operators;

public class SquareRoot_sqrt {
    //use the pythagoreom therom and the square root method.
    public static void main(String[] args) {
        double a,b,c;// you will see double returns decimal where as float and int, long, short will not.
        a = 3;
        b =4;
        //sqrt() is a MATH class and so math but be used
        c = Math.sqrt(a*a + b*b);//this is how your do squares in Java c = the square root of a squared + b squared is the same as a(squared) + b(squared) = c(squared)
        System.out.println("The hypotenuse is " + c);
    }
}
