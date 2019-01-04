

import java.util.Scanner;
public class Vowel {

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
            Vowel obj = new Vowel();
            System.out.println(obj.func(c));


        }

    }
}

