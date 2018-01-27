import org.junit.Test

class CombinationsTest {

    @Test
    fun testCombine() {
        val c = Combinations()

        assert(c.combine(2, 0).isEmpty())

        val list0 = c.combine(2, 1)
        assert(list0.size == 2)
        assert(list0.containsAll(listOf(listOf(1), listOf(2))))

        val list1 = c.combine(4, 2)
        assert(list1.size == 6)
        assert(list1.containsAll(listOf(listOf(2, 4), listOf(3, 4), listOf(2, 3), listOf(1, 2), listOf(1, 3), listOf(1, 4))))

        val list2 = c.combine(4, 3)
        assert(list2.size == 4)
        assert(list2.containsAll(listOf(listOf(1, 2, 3), listOf(1, 2, 4), listOf(1, 3, 4), listOf(2, 3, 4))))
    }

}