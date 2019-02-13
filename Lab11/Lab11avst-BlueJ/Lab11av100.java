// Lab11av100.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;
import java.text.*;

public class Lab11av100
{
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the primes upper bound ===>>  ");
        final int MAX = input.nextInt();
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[])
    {
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        for(int i = 2; i < primes.length; i++){
            primes [i] = true;
        }
        
        for (int k = 2; k < primes.length; k++){
            if (primes[k] == true){
                for (int i = k + 1; i < primes.length; i ++){
                    if ( i % k == 0){
                        primes [i] = false;
                    }
                }
            }
        }
    }

    public static void displayPrimes(boolean primes[])
    {
        System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
        System.out.println();
        int counter = 0;
        for (int i = 2; i < primes.length; i++){
            if (primes[i] == true){
                customFormat("0000", i);
                counter++;
                if (counter == 10){
                    counter = 0;
                    System.out.println();
                }
            }
        }
    }

    static public void customFormat(String pattern, int value) {
      DecimalFormat myFormatter = new DecimalFormat(pattern);
      String output = myFormatter.format(value);
      System.out.print(output + " ");
    }
}



