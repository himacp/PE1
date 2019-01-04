

import java.util.Scanner;

public class Unspecified
{

    private int sum;

    public int function(int n)
    {

        Scanner input=new Scanner(System.in);
        while (input.hasNextInt())
        {
            n = input.nextInt();
            sum += n;
        }
        return sum;

    }

    public static void main(String[] args) 
    {
        int n = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Numbers:");
        Unspecified obj=new Unspecified();
        System.out.println(obj.function(n));



    }
}