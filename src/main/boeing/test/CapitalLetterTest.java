import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class CapitalLetterTest
{
    CapitalLetter object;

        @Before
        public void setUp() {
            object = new CapitalLetter();
        }

        @After
        public void tearDown() {
            object = null;
        }
    @Test
    public void demo()
    {
        CapitalLetter obj = new CapitalLetter ();
        String expectedValue = "The entered character is a Capital Letter";
        //Act
        String actualValue=obj.letter('A');
        //Assert
        assertEquals(expectedValue,actualValue);

    }


}