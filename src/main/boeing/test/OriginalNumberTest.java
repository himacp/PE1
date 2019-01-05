
    import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

    @RunWith(JUnit4.class)
    public class OriginalNumberTest {

        @Test
        public void OriginalNumSuccessTest() {
            OriginalNumber originalNum = new OriginalNumber();
            String actualstr = originalNum.originalNumberGuess(23, 23);
            String expectedstr = "Number guessed matches the original number";
            assertEquals(expectedstr, actualstr);
        }

        @Test
        public void OriginalNumFailureTest() {
            OriginalNumber originalNum = new OriginalNumber();
            String actualstr = originalNum.originalNumberGuess('a',23);
            String expectedstr = "Number guessed is more than the original number";
            assertEquals(expectedstr, actualstr);
        }

    }