package za.ac.mkumsPrg;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Songezo on 2016-03-01.
 */
public class FloatTest {

    private FloatingPoint ft;

    @Before
    public void setUp() throws Exception {
        ft = new FloatingPoint();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testFloatingPoint() throws Exception {
        Assert.assertEquals(1.0, ft.floats(7, 5), 0.0);
    }
}
