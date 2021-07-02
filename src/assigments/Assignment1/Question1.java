package assigments.Assignment1;

import java.util.Scanner;

/** Write the pseudocode & a program to input credits of a Code for Cause
        Campus leader and then output the badge of the lead on the basis of
        the following criteria:
        a. 7500 <= credits : Tera leader
        b. 6000 <= credits < 7500 : Gega leader
        c. 4500 <= credits < 6000 : Mega leader
        d. Credits < 4500 : Rising Star
 */

public class Question1 {

    public static void main(String[] args) {
        System.out.println(badge());

    }

    private static String badge() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the credits");
        int credits = scan.nextInt();
        if (credits < 4500){
            return "Rising Star";
        }
        else if(4500 <= credits && credits < 6000){
            return "Mega leader";
        }
        else if(6000 <= credits && credits < 7500){
            return "Gega leader";
        }
        else {
            return "Tera leader";
        }


    }
}
