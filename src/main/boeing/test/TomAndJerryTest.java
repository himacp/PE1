import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

    @RunWith(JUnit4.class)

    public class TomAndJerryTest
    {
        TomAndJerry obj =new TomAndJerry();
        @Before
        public void setUp() throws Exception {

        }

        @After
        public void tearDown() throws Exception {
            obj = null;
        }

        @Test
        public void demo()
        {
            TomAndJerry obj = new TomAndJerry();
            String expectedValue = "Jerry";
            //Act
            String actualValue=obj.func(22);
            //Assert
            assertEquals(expectedValue,actualValue);
        }


    }


