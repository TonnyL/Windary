import org.junit.Assert;
import org.junit.Test;

public class TransposeMatrixTest {

    @Test
    public void testTranspose() {
        TransposeMatrix tm = new TransposeMatrix();

        Assert.assertEquals(tm.transpose(new int[][]{{1, 1}}), new int[][]{{1}, {1}});

        Assert.assertEquals(tm.transpose(new int[][]{{1}, {1}}), new int[][]{{1, 1}});

        Assert.assertEquals(tm.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}), new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}});

        Assert.assertEquals(tm.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}}), new int[][]{{1, 4}, {2, 5}, {3, 6}});
    }

}
