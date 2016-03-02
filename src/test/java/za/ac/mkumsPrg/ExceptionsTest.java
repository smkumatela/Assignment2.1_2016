package za.ac.mkumsPrg;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Songezo on 2016-03-02.
 */
public class ExceptionsTest {

    private ExceptionsC Exc;

    @Before
    public void setUp() throws Exception {
        Exc = new ExceptionsC();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testExceptions() {
        Assert.assertNotEquals(1, Exc.method1(-1));
    }
}
