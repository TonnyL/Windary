import org.junit.Test

class SetMatrixZeroesTest {

    @Test
    fun testSetZeros() {
        val smz = SetMatrixZeroes()

        val array0 = arrayOf<IntArray>()
        smz.setZeroes(array0)
        assert(array0.isEmpty())

        val array1 = arrayOf(intArrayOf(0, 1))
        smz.setZeroes(array1)
        assert(array1.size == 1)
        assert(array1[0].contentEquals(intArrayOf(0, 0)))

        val array2 = arrayOf(intArrayOf(1, 0, 2), intArrayOf(3, 4, 5), intArrayOf(6, 7, 8))
        smz.setZeroes(array2)
        assert(array2.size == 3)
        assert(array2[0].contentEquals(intArrayOf(0, 0, 0)))
        assert(array2[1].contentEquals(intArrayOf(3, 0, 5)))
        assert(array2[2].contentEquals(intArrayOf(6, 0, 8)))

        val array3 = arrayOf(intArrayOf(0, 1, 1), intArrayOf(2, 0, 2), intArrayOf(3, 3, 0))
        smz.setZeroes(array3)
        assert(array3.size == 3)
        assert(array3[0].contentEquals(intArrayOf(0, 0, 0)))
        assert(array3[1].contentEquals(intArrayOf(0, 0, 0)))
        assert(array3[2].contentEquals(intArrayOf(0, 0, 0)))

        val array4 = arrayOf(intArrayOf(0, 0, 0, 5), intArrayOf(4, 3, 1, 4), intArrayOf(0, 1, 1, 4), intArrayOf(1, 2, 1, 3), intArrayOf(0, 0, 1, 1))
        smz.setZeroes(array4)
        assert(array4.size == 5)
        assert(array4[0].contentEquals(intArrayOf(0, 0, 0, 0)))
        assert(array4[1].contentEquals(intArrayOf(0, 0, 0, 4)))
        assert(array4[2].contentEquals(intArrayOf(0, 0, 0, 0)))
        assert(array4[3].contentEquals(intArrayOf(0, 0, 0, 3)))
        assert(array4[4].contentEquals(intArrayOf(0, 0, 0, 0)))
    }

}