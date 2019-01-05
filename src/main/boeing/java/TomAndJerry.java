/* Hima C P
 *
 * Stack Route,Bangalore
 *
 * Boeing India Pvt Ltd.
 */

/*Program to check whether the given number is odd or even.
 *If its even check whether its between 20 and 30 and print as Jerry.
 *If its odd check whether its between 20 and 30 and print as Tom
 */

import java.util.Scanner;

    public class TomAndJerry {

        String func(int n)
        {
            if (n % 2 ==0)
            {
                if ((n >= 20) && (n <= 30)) /*checking for the condition*/
                {
                    return "Jerry";
                }
            }

            if (n>=20 && n<=30)
            {
                return "Tom";
            }
            else {
                return "Condition is not satisfied";
            }

        }
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            int n;
            n = in.nextInt();
            TomAndJerry obj=new TomAndJerry();
            System.out.println(obj.func(n));


        }
    }
