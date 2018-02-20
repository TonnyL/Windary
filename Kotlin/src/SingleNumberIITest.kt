import org.junit.Assert
import org.junit.Test

class SingleNumberIITest {

    @Test
    fun testSingleNumber() {
        val s = SingleNumberII()

        Assert.assertTrue(s.singleNumber(intArrayOf(1)) == 1)

        Assert.assertTrue(s.singleNumber(intArrayOf(1, 1, 1)) == 0)

        Assert.assertTrue(s.singleNumber(intArrayOf(1, 1, 1, 2)) == 2)

        Assert.assertTrue(s.singleNumber(intArrayOf(1, 1, 1, 2, 2, 2, 3)) == 3)
    }

}