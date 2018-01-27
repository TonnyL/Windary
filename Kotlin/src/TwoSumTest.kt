import org.junit.Test

class TwoSumTest {

    @Test
    fun testTwoSum() {
        assert(TwoSum().twoSum(intArrayOf(2, 5, 5, 11), 10).contentEquals(intArrayOf(1, 2)))
    }

}