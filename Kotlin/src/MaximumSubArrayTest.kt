import org.junit.Test

class MaximumSubArrayTest {

    @Test
    fun testMaxSubArray() {
        val ms = MaximumSubArray()

        assert(ms.maxSubArray(intArrayOf(1)) == 1)

        assert(ms.maxSubArray(intArrayOf(-4, -2)) == -2)

        assert(ms.maxSubArray(intArrayOf(1, 0, -1)) == 1)

        assert(ms.maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)) == 6)
    }

}