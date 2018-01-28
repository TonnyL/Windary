import org.junit.Assert;
import org.junit.Test;

public class WordSearchTest {

    @Test
    public void testExist() {
        WordSearch ws = new WordSearch();

        Assert.assertFalse(ws.exist(new char[][]{{}}, "AB"));

        Assert.assertFalse(ws.exist(null, "AB"));

        char[][] chars = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};

        Assert.assertTrue(ws.exist(chars, "ABCCED"));

        Assert.assertTrue(ws.exist(chars, "SEE"));

        Assert.assertFalse(ws.exist(chars, "ABCB"));
    }

}