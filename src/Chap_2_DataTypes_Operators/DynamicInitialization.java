package Chap_2_DataTypes_Operators;
//Demonstrate dynamic initialization
public class DynamicInitialization {
    public static void main(String[] args) {
        double radius = 5, height = 4;
        //volume is initialized in run time, radius and height are both declared frst but volume is declared when it is called
        double volume = 3.1416 * radius * radius * height;
        //volume of a cylinder is Pi R(squared) * height. since ther eis no squart funcion in java we need t do radius * radius
        System.out.println( " The volume of the cylinder is " + volume);


    }
}
