import org.junit.Assert
import org.junit.Test

class ExcelSheetColumnTitleTest {

    @Test
    fun convertToTitle() {
        val e = ExcelSheetColumnTitle()

        Assert.assertEquals(e.convertToTitle(1), "A")

        Assert.assertEquals(e.convertToTitle(2), "B")

        Assert.assertEquals(e.convertToTitle(26), "Z")

        Assert.assertEquals(e.convertToTitle(27), "AA")

        Assert.assertEquals(e.convertToTitle(28), "AB")

    }

}