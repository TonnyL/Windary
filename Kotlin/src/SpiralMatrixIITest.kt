import org.junit.Test

class SpiralMatrixIITest {

    @Test
    fun testGenerateMatrix() {
        val sm = SpiralMatrixII()

        assert(sm.generateMatrix(0).isEmpty())

        val array0 = sm.generateMatrix(1)
        assert(array0.size == 1)
        assert(array0[0].contentEquals(intArrayOf(1)))

        val array1 = sm.generateMatrix(2)
        assert(array1.size == 2)
        assert(array1[0].contentEquals(intArrayOf(1, 2)))
        assert(array1[1].contentEquals(intArrayOf(4, 3)))

        val array2 = sm.generateMatrix(4)
        assert(array2.size == 4)
        assert(array2[0].contentEquals(intArrayOf(1, 2, 3, 4)))
        assert(array2[1].contentEquals(intArrayOf(12, 13, 14, 5)))
        assert(array2[2].contentEquals(intArrayOf(11, 16, 15, 6)))
        assert(array2[3].contentEquals(intArrayOf(10, 9, 8, 7)))
    }

}
