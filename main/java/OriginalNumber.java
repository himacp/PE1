import java.util.Scanner;

public class OriginalNumber {

    public String originalNumberGuess(int num, int maximum)
    {
        if( num >= 1 && num <= 100 )
        {
            if( num == maximum )
            {
                return "Number guessed matches the original number";
            }
            else if( num > maximum )
            {
                return "Number guessed is more than the original number";
            }
            else
            {
                return "Number guessed is less than the original number";
            }
        }

        return "No. is out of Range.";
    }



}
