import org.junit.Test

class SubsetsIITest {

    @Test
    fun testSubsetsWithDup() {
        val s = SubsetsII()

        assert(s.subsetsWithDup(intArrayOf()).isEmpty())

        val list0 = s.subsetsWithDup(intArrayOf(1))
        assert(list0.size == 2)
        assert(list0.toSet() == listOf(listOf(), listOf(1)).toSet())

        val list1 = s.subsetsWithDup(intArrayOf(1, 1))
        assert(list1.size == 3)
        assert(list1.toSet() == listOf(listOf(), listOf(1), listOf(1, 1)).toSet())

        val list2 = s.subsetsWithDup(intArrayOf(1, 2))
        assert(list2.size == 4)
        assert(list2.toSet() == listOf(listOf(), listOf(1), listOf(2), listOf(2, 1)).toSet())

        val list3 = s.subsetsWithDup(intArrayOf(1, 2, 2))
        assert(list3.size == 6)
        assert(list3.toSet() == listOf(listOf(), listOf(1), listOf(2), listOf(2, 2, 1), listOf(2, 2), listOf(2, 1)).toSet())

        val list4 = s.subsetsWithDup(intArrayOf(4, 4, 4, 1, 4))
        assert(list4.size == 10)
        assert(list4.toSet() == listOf(listOf(), listOf(1), listOf(4, 1), listOf(4, 4, 1), listOf(4, 4, 4, 1), listOf(4, 4, 4, 4, 1), listOf(4), listOf(4, 4), listOf(4, 4, 4), listOf(4, 4, 4, 4)).toSet())
    }

}