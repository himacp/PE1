package com.company;
/**
 *  This program is about
 *   a. Print an error message if the input is not a letter
 *   b. If the input having more than one letter, print the required output
 *    (Vowel or Consonant) for each letter
 */

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = input.nextLine();
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'|| c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            {
                    System.out.println(str.charAt(i) + " = Vowel");
            }
                else
                    {
                System.out.println(str.charAt(i) + " = Consonent");
            }
        }

    }
}

