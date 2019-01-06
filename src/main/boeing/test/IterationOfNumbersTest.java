import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)

public class IterationOfNumbersTest
{

    IterationOfNumbers object;

        @Before
        public void setUp() {
            object = new IterationOfNumbers();
        }

        @After
        public void tearDown() {
            object = null;
        }
    @Test
    public void demo()
    {
        IterationOfNumbers obj = new IterationOfNumbers();
        String expectedValue = "1 2 2 3 3 3 ";
        //Act
        String actualValue=obj.function(3);
        //Assert
        assertEquals(expectedValue,actualValue);

    }

}