
import java.util.Scanner;

public class CapitalLetter
{
    String func(char h)
    {
        if( h >=65 && h <= 90 )
        {
            return "Capital Letter";
        }
        else if( h >=97 && h <= 122 )
        {
            return "Small Letter";
        }
        else if( h >= 48 && h <= 57 )
        {
            return "Digit";
        }
        else
        {
            return "Special-Symbol";
        }

    }


        public static void main(String[] args)
        {
            char h;
            Scanner input=new Scanner(System.in);
            h =input.next().charAt(0);
            CapitalLetter obj=new CapitalLetter();
            System.out.println(obj.func(h));

        }
}
