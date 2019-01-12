package com.stackroute.wave4;/* Hima C P
 *
 * Stack Route,Bangalore
 *
 * Boeing India Pvt Ltd.
 */

/*Create a program that accepts a word as input and checks for each single character letter in the word whether
  *it is a consonant or vowel.
  *Print an error message if the input is not a letter
  *If the input having more than one letter, print the required output (Vowel or Consonant) for each letter*/


import java.util.Scanner;
public class VowelConsonant {

    String func(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return "vowel";
        } else {
            return "Consonant";
        }


        }

    }

