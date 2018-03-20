import org.junit.Assert;
import org.junit.Test;

public class ExcelSheetColumnTitleTest {

    @Test
    public void convertToTitle() {
        ExcelSheetColumnTitle e = new ExcelSheetColumnTitle();

        Assert.assertEquals(e.convertToTitle(1), "A");

        Assert.assertEquals(e.convertToTitle(2), "B");

        Assert.assertEquals(e.convertToTitle(26), "Z");

        Assert.assertEquals(e.convertToTitle(27), "AA");

        Assert.assertEquals(e.convertToTitle(28), "AB");

    }

}