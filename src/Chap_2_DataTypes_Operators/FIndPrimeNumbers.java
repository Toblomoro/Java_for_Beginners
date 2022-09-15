package Chap_2_DataTypes_Operators;


import java.util.Scanner;

public class FIndPrimeNumbers {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter desired number: ");
        String input = scanner.nextLine();

        int maxNumber = Integer.parseInt(input);

        System.out.println("List of prime numbers between 1 - " + maxNumber);

        for (int num = 2; num <=maxNumber; num++){
            boolean isPrime = true;
            for (int i = 2; i < num/2; i++) {
                if ( num % i == 0){
                    isPrime = false;
                    break;
                }

            }
            if (isPrime == true) System.out.println(num);
        }
    }
}