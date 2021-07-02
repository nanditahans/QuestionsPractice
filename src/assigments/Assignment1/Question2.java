package assigments.Assignment1;

import java.util.Scanner;

/**
 * Write the pseudocode & a program to calculate the simple interest
 * based on the inputs(amount, rate, time) provided by the user.
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter amount,rate and time");
        int amount = scan.nextInt();
        int rate = scan.nextInt();
        int time = scan.nextInt();
        System.out.println(simpleInterest(amount,rate,time));
    }

    private static int simpleInterest(int amount, int rate, int time) {
        return (amount*rate*time)/100;
    }
}
