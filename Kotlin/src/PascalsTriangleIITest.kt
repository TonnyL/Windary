import org.junit.Assert
import org.junit.Test

class PascalsTriangleIITest {

    @Test
    fun testGetRow() {
        val p = PascalsTriangleII()

        Assert.assertEquals(p.getRow(0), listOf(1))

        Assert.assertEquals(p.getRow(1), listOf(1, 1))

        Assert.assertEquals(p.getRow(2), listOf(1, 2, 1))

        Assert.assertEquals(p.getRow(3), listOf(1, 3, 3, 1))

        Assert.assertEquals(p.getRow(4), listOf(1, 4, 6, 4, 1))
    }

}