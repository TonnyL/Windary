import org.junit.Test

class ThreeSumTest {

    @Test
    fun testThreeSum() {
        val ts = ThreeSum()

        assert(ts.threeSum(intArrayOf(-1, 0)).isEmpty())

        val list0 = ts.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))
        assert(list0.size == 2)
        assert(list0.toSet() == setOf(listOf(-1, -1, 2), listOf(-1, 0, 1)))

        val list1 = ts.threeSum(intArrayOf(0, 0, 0))
        assert(list1.size == 1)
        assert(list1 == listOf(listOf(0, 0, 0)))

        val list2 = ts.threeSum(intArrayOf(-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6))
        assert(list2.size == 6)
        assert(list2.toSet() == setOf(listOf(-4, -2, 6), listOf(-4, 0, 4), listOf(-4, 1, 3), listOf(-4, 2, 2), listOf(-2, -2, 4), listOf(-2, 0, 2)))
    }

}