/* Hima C P
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = input.nextLine();
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            VowelConsonant obj = new VowelConsonant();
            System.out.println(obj.func(c));


        }

    }
}

