package za.ac.mkumsPrg;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Songezo on 2016-03-02.
 */
public class FalseTest {

    private FalseClsss fc;

    @Before
    public void setUp() throws Exception {
        fc = new FalseClsss();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testFalse() throws Exception {
        Assert.assertFalse("this should be false", fc.FalseMeth());
    }
}
