package assigments.Assignment1;

import java.util.Scanner;

/**
 * Write the pseudocode & the program to calculate GCD of two number
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int no1 = scan.nextInt();
        int no2 = scan.nextInt();
        System.out.println(gcd(no1,no2));

    }

    private static int gcd(int no1, int no2) {
        int gcd = 0;
        for (int n = 1; n < no1 && n < no2 ; n++) {
            if ( no1 % n == 0 && no2 % n == 0){
                gcd = n;
            }
        }
        return gcd;
    }
}
