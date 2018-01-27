import org.junit.Test

class FourSumTest {

    @Test
    fun testFourSum() {
        val fs = FourSum()

        val list0 = fs.fourSum(intArrayOf(1, 0, -1, 0, -2, 2), 0)
        assert(list0.size == 3)
        assert(list0.containsAll(listOf(listOf(-1, 0, 0, 1), listOf(-2, -1, 1, 2), listOf(-2, 0, 0, 2))))

        val list1 = fs.fourSum(intArrayOf(-5, 5, 4, -3, 0, 0, 4, -2), 4)
        assert(list1.size == 2)
        assert(list1.containsAll(listOf(listOf(-5, 0, 4, 5), listOf(-3, -2, 4, 5))))
    }

}