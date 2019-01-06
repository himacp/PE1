import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class RepeatWordTest {
    RepeatWord object;

    @Before
    public void setUp() {
        object = new RepeatWord();
    }

    @After
    public void tearDown() {
        object = null;
    }

    @Test
    public void repeatWordTest() {
        RepeatWord repeatWord = new RepeatWord();
        String expectedValue = "stackroutetete";
        //Act
        String actualValue = repeatWord.repeatNtimes("stackroute", 2);
        //Assert
        assertEquals(expectedValue, actualValue);

    }
}

