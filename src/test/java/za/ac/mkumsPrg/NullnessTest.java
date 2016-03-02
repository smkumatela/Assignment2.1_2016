package za.ac.mkumsPrg;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Songezo on 2016-03-01.
 */
public class NullnessTest {

    private Nullness nulls;

    @Before
    public void setUp() throws Exception {
        nulls = new Nullness();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testNullness() throws Exception {
        Assert.assertNull(nulls.nuullMessage());
    }
}
