package assigments.Assignment1;

import java.util.Scanner;

/**
 * Write a program to reverse a number (9735 -> 5379)
 */
public class Question6 {
    public static void main(String[] args) {
        System.out.println("Please Enter the Number");
        Scanner scan =new Scanner(System.in);
        int no = scan.nextInt();
        System.out.println("Reverse of The Number is : " + reverseOfNumber(no));
    }

    private static int reverseOfNumber(int no) {
        int rev = 0;
        int r=no;
        while (no!=0){
            r = no % 10;
            rev = rev * 10 + r;
            no = no / 10;
        }
        return rev;
    }
}
