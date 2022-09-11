public class GalToLitTable {
    /*This file displays a conversion table of gallons to litres

     */
    public static void main(String[] args) {
        double gallons, litres;
        int counter;
        // set line counter to start at 0
        counter = 0;
        for (gallons = 1; gallons <= 100 ; gallons++) {
            litres = gallons * 3.7854; //converting it to litres
            System.out.println(gallons + " gallons per "+ litres + " litres.");
            //Create a counter loop of sorts
            counter++;
            //every 10th time print a blank line using an iff statement
            if ( counter == 10){ // set counter to perform below at 10.
                System.out.println(); //prints a blank line
                counter = 0; // resets the counter to 0
            }

        }
    }
}
