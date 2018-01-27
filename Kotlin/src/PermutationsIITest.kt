import org.junit.Test

class   PermutationsIITest {

    @Test
    fun testPermuteUnique() {
        val p = PermutationsII()

        assert(p.permuteUnique(intArrayOf()).isEmpty())

        val list0 = p.permuteUnique(intArrayOf(1))
        assert(list0.size == 1)
        assert(list0.containsAll(listOf(listOf(1))))

        val list1 = p.permuteUnique(intArrayOf(1, 1, 2))
        assert(list1.size == 3)
        assert(list1.containsAll(listOf(listOf(1, 1, 2), listOf(1, 2, 1), listOf(2, 1, 1))))
    }

}