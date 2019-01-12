package com.stackroute.wave4;/* Hima C P
 *
 * Stack Route,Bangalore
 *
 * Boeing India Pvt Ltd.
 */

/* Program to reverse the given input string and without using string buffer*/


import java.util.Scanner;
public class ReverseNumber {
    public String function(String str)
    {

        String s;
        s="";
        /*Reversing of string*/
        for( int i=str.length()-1 ; i >= 0 ; i-- )

        {
            s=s+str.charAt(i);
        }
        return s;

    }

}

