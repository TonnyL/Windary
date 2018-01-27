import org.junit.Test

class SubsetsTest {

    @Test
    fun testSubsets() {
        val s = Subsets()

        val list0 = s.subsets(intArrayOf())
        assert(list0.size == 1)
        assert(list0 == listOf(listOf<Int>()))

        val list1 = s.subsets(null)
        assert(list1.size == 1)
        assert(list1 == listOf(listOf<Int>()))

        // [[], [1]]
        val list2 = s.subsets(intArrayOf(1))
        assert(list2.size == 2)
        assert(list2.toSet() == setOf(listOf(), listOf(1)))

        // [[], [1], [2], [1, 2]]
        val list3 = s.subsets(intArrayOf(1, 2))
        assert(list3.size == 4)
        assert(list3.toSet() == setOf(listOf(), listOf(1), listOf(2), listOf(1, 2)))

        // [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
        val list4 = s.subsets(intArrayOf(1, 2, 3))
        assert(list4.size == 8)
        assert(list4.toSet() == setOf(listOf(), listOf(1), listOf(2), listOf(1, 2), listOf(3), listOf(1, 3), listOf(2, 3), listOf(1, 2, 3)))
    }

}