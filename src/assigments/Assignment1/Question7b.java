package assigments.Assignment1;

import java.util.Scanner;

/**
 Write programs to print the following patterns for an input n = 5:
 b.  1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5
 */
public class Question7b {
    public static void main(String[] args) {
        System.out.println("Please Enter the No of Rows");
        Scanner scan =new Scanner(System.in);
        int no = scan.nextInt();
        pattern(no);
    }

    private static void pattern(int r) {
        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"\t");
            }
            System.out.print("\n");
        }
    }
}
