import org.junit.Assert
import org.junit.Test

import java.util.Arrays

class RotateArrayTest {

    @Test
    fun testRotate() {
        val ra = RotateArray()

        val array0 = intArrayOf(1)
        ra.rotate(array0, 1)
        Assert.assertTrue(Arrays.equals(array0, intArrayOf(1)))

        val array1 = intArrayOf(1, 2)
        ra.rotate(array1, 1)
        Assert.assertTrue(Arrays.equals(array1, intArrayOf(2, 1)))

        val array2 = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        ra.rotate(array2, 3)
        Assert.assertTrue(Arrays.equals(array2, intArrayOf(5, 6, 7, 1, 2, 3, 4)))
    }

}