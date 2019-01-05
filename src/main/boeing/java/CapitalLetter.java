/* Hima C P
 *
 * Stack Route,Bangalore
 *
 * Boeing India Pvt Ltd.
 */


/**
 *  This program is about
 *   a. whether the character entered is a capital letter.
 *   b. whether the character entered is a Small letter.
 *   c.whether the character entered is a digit.
 *   whether the character entered is a special Character.
 */
import java.util.Scanner;
public class CapitalLetter
{

        public static void main(String[] args)
        {
            char h;
            Scanner input=new Scanner(System.in);
            h =input.next().charAt(0);
            if( h >=65 && h <= 90 )
            {
                System.out.println("The entered character is a Capital Letter");
            }
            else if( h >=97 && h <= 122 )
            {
                System.out.println("The entered character is a small Letter");
            }
            else if( h >= 48 && h <= 57 )
            {
                System.out.println("The entered character is a Digit");
            }
            else
            {
                System.out.println("The entered character is a Special Symbol");
            }

        }
}
