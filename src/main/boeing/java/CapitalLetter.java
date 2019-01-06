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

        public String letter(char h){

            if( h >=65 && h <= 90 )
            {
                return "The entered character is a Capital Letter";
            }
            else if( h >=97 && h <= 122 )
            {
                return "The entered character is a small Letter";
            }
            else if( h >= 48 && h <= 57 )
            {
                return "The entered character is a Digit";
            }
            else
            {
                return "The entered character is a Special Symbol";
            }

        }
}

