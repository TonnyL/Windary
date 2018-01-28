import org.junit.Assert;
import org.junit.Test;

public class SearchInRotatedSortedArrayIITest {

    @Test
    public void testSearch() {
        SearchInRotatedSortedArrayII s = new SearchInRotatedSortedArrayII();

        Assert.assertFalse(s.search(null, 4));

        Assert.assertFalse(s.search(new int[]{3, 2}, 4));

        Assert.assertFalse(s.search(new int[]{3, 1, 2}, 4));

        Assert.assertTrue(s.search(new int[]{3, 1, 2}, 2));

        Assert.assertTrue(s.search(new int[]{2, 2, 2, 2, 3, 4, 1, 1}, 4));

        Assert.assertTrue(s.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 2));

        Assert.assertTrue(s.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 7));

        Assert.assertTrue(s.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 5));
    }

}