import org.junit.Assert;
import org.junit.Test;

public class SearchInRotatedSortedArrayTest {

    @Test
    public void testSearch() {
        SearchInRotatedSortedArray s = new SearchInRotatedSortedArray();

        Assert.assertTrue(s.search(new int[]{}, 1) == -1);

        Assert.assertTrue(s.search(new int[]{0, 1, 2, 4, 5, 6, 7}, 7) == 6);

        Assert.assertTrue(s.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 7) == 3);

        Assert.assertTrue(s.search(new int[]{5, 6, 7, 0, 1, 2, 4}, 7) == 2);

        Assert.assertTrue(s.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 8) == -1);
    }

}