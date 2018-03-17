import org.junit.Assert;
import org.junit.Test;

public class MajorityElementTest {

    @Test
    public void majorityElement() {
        MajorityElement me = new MajorityElement();

        Assert.assertTrue(me.majorityElement(new int[]{1, 1, 2}) == 1);

        Assert.assertTrue(me.majorityElement(new int[]{0, 1, 1, 1, 2, 3, 1}) == 1);

        Assert.assertTrue(me.majorityElement(new int[]{1, 1}) == 1);
    }

}