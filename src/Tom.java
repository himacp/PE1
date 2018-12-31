

package com.company;

/**This program is about which accepts an integer number as input
 And perform the following conditional checks:
 *a. Print Tom if number is odd and exists between 20 to 30
 *b. Print Jerry, if number is even and exists between 20 and 30
*/
import java.util.Scanner;

    public class Tom {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            int n;
            n = in.nextInt();
            if (n % 2 ==0)
            {
                if ((n >= 20) && (n <= 30))
                    System.out.println("Jerry");
            }
            else if (n>=20 && n<=30)
            {
                System.out.println("Tom");
            }
            else
                System.out.println("Condition is not satisfied");

        }
    }
