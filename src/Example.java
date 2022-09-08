public class Example {
    public static void main(String[] args) {
        int var1; //this declares a variable
        int var2; // this declares a second variable
        //you could declare both via ---   int var1, var2   ---
        var1 = 1024; //this declares var1

        System.out.println(("var1 contains " + var1));
        var2 = var1 / 2; //this declares var2
        System.out.println("var2 contains  var1 divided by 2");
        System.out.println((var2));

        //declaring a double variable
        double x = 10.0;
        int var = 10;
        var = var / 4;
        x = x /4;
//See how double is more precise  than int (as int returns 10/4 = 2 and double returns 10.5)
        System.out. println( "After division var = " + var);
        System.out. println( "After division x = " + x);
        System.out. println( "This shows the difference of double and var when it comes to rounding of numbers");



    }
}