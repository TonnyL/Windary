import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayIITest {

    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicatesFromSortedArrayII r = new RemoveDuplicatesFromSortedArrayII();

        Assert.assertTrue(r.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}) == 5);

        Assert.assertTrue(r.removeDuplicates(new int[]{1, 1, 2, 2, 3}) == 5);

        Assert.assertTrue(r.removeDuplicates(null) == 0);

        Assert.assertTrue(r.removeDuplicates(new int[]{1, 1}) == 2);

        Assert.assertTrue(r.removeDuplicates(new int[]{1, 1, 1, 1}) == 2);
    }

}