import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinsTest {
    Bins bins;

    @Test
    public void testIncrement() {
        Bins bins = new Bins(2, 12);

        Integer expected = 1;
        bins.increment(11);

        Assert.assertEquals(expected, bins.getBinCounts(11));
    }

    public void testGetBinCounts() {
    }

    @Test
    public void getBinTest() {
        Bins bins = new Bins(2, 12);
        Integer expected = 0;


        Assert.assertEquals(expected, bins.getBinCounts(10));
    }

}
