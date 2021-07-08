import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiceTest {

    Dice dice;

    @Before
    void setUp() {
        Dice dice = new Dice(2);
        dice.setSeed(1L);
    }

    @Test
    void tossAndSumTest() {
        Integer expected = 0;
        Integer actual = dice.tossAndSum();
        Assert.assertEquals(expected, actual);
    }
}
