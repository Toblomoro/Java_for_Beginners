package Chap_2_DataTypes_Operators;
//THis program compute the total inches in 1 square mile.
public class InchesSquareMile {
    public static void main(String[] args) {
long cubicInches;
long inchesPerMile;
inchesPerMile= 5280 *12;
cubicInches= inchesPerMile * inchesPerMile * inchesPerMile;
System.out.println("There are " + cubicInches + " cubic inches in one square mile");

    }
}
