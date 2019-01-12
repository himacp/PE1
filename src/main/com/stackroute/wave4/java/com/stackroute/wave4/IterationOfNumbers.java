package com.stackroute.wave4;


/* Hima C P
 *
 * Stack Route,Bangalore
 *
 * Boeing India Pvt Ltd.
 */

/*Program to print a number pattern.
 * If the input is 5.
 * Output should be 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5.
 */

import java.util.Scanner;

public class IterationOfNumbers
{

    String function(int num)
    {
    String str;
    str="";
       for( int i=1; i<=num; i++ )
    {
        for( int j=1; j<=i ;j++ )
        {
            str=str+Integer.toString(i)+" "; //conversion of integer to string
        }
    }
       return str;
       }

    }
