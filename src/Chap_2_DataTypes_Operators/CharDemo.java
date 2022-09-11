package Chap_2_DataTypes_Operators;
//How are char the same as int's they use the ASCII library to convert the numbers into letters
public class CharDemo {
    public static void main(String[] args) {
        char ch;
        ch = 'e';
        System.out.println("The character is " + ch);
        ch++; //increase char ch, treating it as we would an integer, increases based upon ASCII
        System.out.println("The character is now " + ch); //and it moves it down the ASCII
        ch = 90;
        System.out.println("The character is now " + ch);//you can see the integer assign to a char yields the ASCII notation in spot 90.

    }
}
