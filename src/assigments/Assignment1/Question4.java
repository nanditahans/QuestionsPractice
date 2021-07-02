package assigments.Assignment1;

import java.util.Scanner;

/**
 * Write a program to print even numbers after odd times jump.
 * E.g: 2, 6, 14, 26, …
 * 2 (then jump 1 even number 4) -> 6
 * 6 (then jump 3 even numbers 8, 10, 12) -> 14
 * 14 (then jump 5 even numbers 16,18,20,22,24) -> 26
 */
public class Question4 {
    public static void main(String[] args) {
        System.out.println("Please enter the number of Terms");
        Scanner scan = new Scanner(System.in);
        int noOfTerms = scan.nextInt();
        printSeries(noOfTerms);
    }

    private static void printSeries(int noOfTerms) {

            int i=0;
            int n= 1;
            int p =1 ;
            while(n<=noOfTerms) {
                System.out.print(p * 2 + "\t");
                i = i + 2 ;
                p = p +i;
                n++;
            }

    }
}
