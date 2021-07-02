package assigments.Assignment1;

import java.util.Scanner;

/**
 * Write a program to count the number of digits in a number.
 */
public class Question5 {
    public static void main(String[] args) {
        System.out.println("Please Enter the Number");
        Scanner scan =new Scanner(System.in);
        int no = scan.nextInt();
        System.out.println("Number of Digits are : " +countNumberOfDigits(no));
    }

    private static int countNumberOfDigits(int no) {
        int count =0 ;
        while (no!=0){
            no = no /10;
            count ++;
        }
        return count;
    }
}
