import org.junit.Assert;
import org.junit.Test;

public class RemoveElementTest {

    @Test
    public void testRemoveElement() {
        RemoveElement re = new RemoveElement();

        Assert.assertTrue(re.removeElement(new int[]{3, 2, 2, 3}, 3) == 2);

        Assert.assertTrue(re.removeElement(new int[]{3, 3}, 3) == 0);

        Assert.assertTrue(re.removeElement(new int[]{}, 0) == 0);

        Assert.assertTrue(re.removeElement(new int[]{2, 3, 4, 5, 888, 2}, 2) == 4);

        Assert.assertTrue(re.removeElement(new int[]{3, 3}, 0) == 2);
    }

}