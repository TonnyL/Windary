import org.junit.Test

class SpiralMatrixTest {

    @Test
    fun testSpiralOrder() {
        val sm = SpiralMatrix()

        assert(sm.spiralOrder(arrayOf()).isEmpty())

        assert(sm.spiralOrder(arrayOf(intArrayOf(1), intArrayOf(2), intArrayOf(3))) == listOf(1, 2, 3))

        assert(sm.spiralOrder(arrayOf(intArrayOf(1, 2, 3))) == listOf(1, 2, 3))

        assert(sm.spiralOrder(arrayOf(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), intArrayOf(11, 12, 13, 14, 15, 16, 17, 18, 19, 20))) == listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11))

        assert(sm.spiralOrder(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))) == listOf(1, 2, 4, 3))

        assert(sm.spiralOrder(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(5, 6))) == listOf(1, 2, 4, 6, 5, 3))

        assert(sm.spiralOrder(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))) == listOf(1, 2, 3, 6, 9, 8, 7, 4, 5))

        assert(sm.spiralOrder(arrayOf(intArrayOf(1, 2, 3, 4), intArrayOf(5, 6, 7, 8), intArrayOf(9, 10, 11, 12))) == listOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7))
    }

}