import org.junit.Assert
import org.junit.Test

class SingleNumberTest {

    @Test
    fun testSingleNumber() {
        val sn = SingleNumber()

        Assert.assertTrue(sn.singleNumber(intArrayOf(1)) == 1)

        Assert.assertTrue(sn.singleNumber(intArrayOf(1, 1, 2)) == 2)

        Assert.assertTrue(sn.singleNumber(intArrayOf(1, 1, 2, 2, 3)) == 3)
    }

}