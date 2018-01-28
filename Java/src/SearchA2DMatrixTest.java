import org.junit.Assert;
import org.junit.Test;

public class SearchA2DMatrixTest {

    @Test
    public void testSearchMatrix() {
        SearchA2DMatrix s = new SearchA2DMatrix();

        Assert.assertFalse(s.searchMatrix(new int[][]{}, 0));

        Assert.assertFalse(s.searchMatrix(new int[][]{{}}, 1));

        Assert.assertTrue(s.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 3));

        Assert.assertTrue(s.searchMatrix(new int[][]{{1}}, 1));
    }
    
}