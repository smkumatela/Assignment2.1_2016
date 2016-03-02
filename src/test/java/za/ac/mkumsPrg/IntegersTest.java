package za.ac.mkumsPrg;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Songezo on 2016-03-01.
 */
public class IntegersTest {
    private Integers into;

    @Before
    public void setUp() throws Exception {
        into = new Integers();

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testNuumbers() throws Exception {
        Assert.assertEquals(8, into.add(4, 4));
    }
}
