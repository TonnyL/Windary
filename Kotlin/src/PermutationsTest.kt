import org.junit.Test

class PermutationsTest {

    @Test
    fun testPermute() {
        val p = Permutations()

        assert(p.permute(intArrayOf()).isEmpty())

        val list0 = p.permute(intArrayOf(1))
        assert(list0.size == 1)
        assert(list0.containsAll(listOf(listOf(1))))

        val list1 = p.permute(intArrayOf(1, 2))
        assert(list1.size == 2)
        assert(list1.containsAll(listOf(listOf(1, 2), listOf(2, 1))))

        val list2 = p.permute(intArrayOf(1, 2, 3))
        assert(list2.size == 6)
        assert(list2.containsAll(listOf(listOf(1, 2, 3), listOf(1, 3, 2), listOf(2, 1, 3), listOf(2, 3, 1), listOf(3, 1, 2), listOf(3, 2, 1))))
    }

}