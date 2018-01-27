import org.junit.Test

class CombinationSumTest {

    @Test
    fun testCombinationSum() {
        val cs = CombinationSum()

        val list0 = cs.combinationSum(intArrayOf(2, 3, 6, 7), 7)
        assert(list0.size == 2)
        assert(list0.containsAll(listOf(listOf(7), listOf(2, 2, 3))))

        val list1 = cs.combinationSum(intArrayOf(1), 3)
        assert(list1.size == 1)
        assert(list1[0] == listOf(1, 1, 1))

        val list2 = cs.combinationSum(intArrayOf(1, 2), 4)
        assert(list2.size == 3)
        assert(list2.containsAll(listOf(listOf(2, 2), listOf(1, 1, 2), listOf(1, 1, 1, 1))))
    }

}