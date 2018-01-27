import org.junit.Test

class PlusOneTest {

    @Test
    fun testPlusOne() {
        val po = PlusOne()

        assert((po.plusOne(intArrayOf(1))).contentEquals(intArrayOf(2)))

        assert((po.plusOne(intArrayOf(9))).contentEquals(intArrayOf(1, 0)))

        assert((po.plusOne(intArrayOf(9, 9))).contentEquals(intArrayOf(1, 0, 0)))

        assert((po.plusOne(intArrayOf(2, 8, 9, 9, 9))).contentEquals(intArrayOf(2, 9, 0, 0, 0)))

        assert((po.plusOne(intArrayOf(2, 8, 8, 9))).contentEquals(intArrayOf(2, 8, 9, 0)))
    }

}