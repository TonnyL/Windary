import org.junit.Assert;
import org.junit.Test;

public class SearchInsertPositionTest {

    @Test
    public void testSearchInsert() {
        SearchInsertPosition sip = new SearchInsertPosition();

        Assert.assertTrue(sip.searchInsert(new int[]{1}, 0) == 0);

        Assert.assertTrue(sip.searchInsert(new int[]{1, 3, 5, 6}, 5) == 2);

        Assert.assertTrue(sip.searchInsert(new int[]{1, 3, 5, 6}, 2) == 1);

        Assert.assertTrue(sip.searchInsert(new int[]{1, 3, 5, 6}, 7) == 4);

        Assert.assertTrue(sip.searchInsert(new int[]{1, 3, 5, 6}, 0) == 0);
    }

}