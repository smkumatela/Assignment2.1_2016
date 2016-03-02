package za.ac.mkumsPrg;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Collection;

/**
 * Created by Songezo on 2016-03-01.
 */
public class NotNullTest {

    private NotNullC notN;

    @Before
    public void setUp() throws Exception {
        notN = new NotNullC();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return null;

    }

    @Test
    public void testNotNull() throws Exception {
        Assert.assertNotNull(notN.notNullMessage());
    }
}
