import org.junit.Assert
import org.junit.Test

class TransposeMatrixTest {

    @Test
    fun testTranspose() {
        val tm = TransposeMatrix()

        Assert.assertEquals(tm.transpose(arrayOf(intArrayOf(1, 1))), arrayOf(intArrayOf(1), intArrayOf(1)))

        Assert.assertEquals(tm.transpose(arrayOf(intArrayOf(1), intArrayOf(1))), arrayOf(intArrayOf(1, 1)))

        Assert.assertEquals(tm.transpose(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))), arrayOf(intArrayOf(1, 4, 7), intArrayOf(2, 5, 8), intArrayOf(3, 6, 9)))

        Assert.assertEquals(tm.transpose(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6))), arrayOf(intArrayOf(1, 4), intArrayOf(2, 5), intArrayOf(3, 6)))
    }

}
