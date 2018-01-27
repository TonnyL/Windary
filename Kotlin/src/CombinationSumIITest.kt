import org.junit.Test

class CombinationSumIITest {

    @Test
    fun testCombinationSum2() {
        val cs = CombinationSumII()

        val list0 = cs.combinationSum2(intArrayOf(10, 1, 2, 7, 6, 1, 5), 8)
        assert(list0.size == 4)
        assert(list0.containsAll(listOf(listOf(1, 7), listOf(1, 2, 5), listOf(2, 6), listOf(1, 1, 6))))

        assert(cs.combinationSum2(intArrayOf(1), 2).isEmpty())

        val list1 = cs.combinationSum2(intArrayOf(1, 1, 2, 2), 4)
        assert(list1.size == 2)
        assert(list1.containsAll(listOf(listOf(1, 1, 2), listOf(2, 2))))
    }

}