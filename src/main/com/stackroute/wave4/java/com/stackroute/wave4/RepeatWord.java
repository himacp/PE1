package com.stackroute.wave4;/* Hima C P
 *
 * Stack Route,Bangalore
 *
 * Boeing India Pvt Ltd.
 */

/* Program to repeat the last n characters of the string n times along with the given string.
 */

public class RepeatWord
{
    String repeatNtimes(String str, int n) {
        String string1="";


        for (int i = 0; i <= str.length() - 1; i++) {
            string1 = string1 + str.charAt(i);  //Checking for each character
        }
        for (int j = 0; j < n; j++) {
            for (int i = str.length() - n; i <= str.length() - 1; i++) // Repeatition of word
            {
                string1 = string1 + str.charAt(i);
            }
        }
        return string1;
    }
}

