import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
        // Expected: [], length = 0
        Assert.assertTrue(r.removeDuplicates(new int[]{}) == 0);
        // Expected: [1, 2, 2], length = 2
        Assert.assertTrue(r.removeDuplicates(new int[]{1, 2, 2}) == 2);
        // Expected: [1, 1, 1], length = 1
        Assert.assertTrue(r.removeDuplicates(new int[]{1, 1, 1}) == 1);
        // Expected: [1, 2, 3, 4, 4], length = 4
        Assert.assertTrue(r.removeDuplicates(new int[]{1, 1, 2, 3, 4}) == 4);
    }

}