package Chap_2_DataTypes_Operators;
//a program that tells you how far th storm is based upon seeign the lighning strike and hearing it

public class HowFarIsTheLighning {
    public static void main(String[] args) {
        double distance;
        double time;
        int soundSpeed = 1100;
        double distMiles;
        double echoTime;
        double distToWall;

        time = 7.2;
        echoTime = 1.2; //if you clap your hands and time the echofrom a large object (like a brickwall) you can add or subtract it to get the time to a different object.
        distance = time * soundSpeed;
        distMiles = distance/5280;
        distToWall = (time + echoTime) * soundSpeed;
        System.out.println("That lightning was " + distance + " feet away!");
        System.out.println("That lightning was " + distMiles + " miles away!");
        System.out.println("That lightning was " + distToWall + " feet from the school wall!");



    }
}
