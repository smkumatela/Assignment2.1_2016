package za.ac.mkumsPrg;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Songezo on 2016-03-02.
 */
public class TruthTest {

    private Truth tr;

    @Before
    public void setUp() throws Exception {
        tr = new Truth();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testTruth() throws Exception {
        Assert.assertTrue("this should be true", tr.checkTruth());


    }
}
