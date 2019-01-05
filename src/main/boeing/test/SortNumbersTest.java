
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortNumbersTest {
    SortNumbers ob =new SortNumbers();
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void sumOfNumbers() {
        int expectedValue = 4;
        //Act
        int actualValue = ob.sumOfNumbers(1232);
        //assert
        assertEquals(expectedValue,actualValue);

    }
}