
import java.util.Scanner;

public class ReverseNumber {
    public String function(String str)
    {

        String s;
        s="";
        for( int i=str.length()-1 ; i >= 0 ; i-- )

        {
            s=s+str.charAt(i);


        }
        return s;

    }
    public static void main(String[] args)
    {
        String str;
        Scanner in=new Scanner(System.in);
        str=in.nextLine();
        ReverseNumber obj=new ReverseNumber();
        System.out.println(obj.function(str));

    }
}

