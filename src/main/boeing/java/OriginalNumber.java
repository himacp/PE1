

/**
 *  This program is about
 *  It accepts a number from user as input (set the limit say 1 - 50 or 1 - 100)
 *  a.Number guessed is more than original number
 *  b.Number guessed is less than original number
 *  c.Number guessed matches the original number
 */

    import java.util.Scanner;

    public class OriginalNumber {

    String guess(int number, int compare) {

        while (true) {
            if (number < compare) {
                return "Number guessed is less than original number";

            } else if (number > compare) {
                return "Number guessed is greater than original number";

            } else {
                return "Number guessed matches the original number";
            }
        }
    }
}
