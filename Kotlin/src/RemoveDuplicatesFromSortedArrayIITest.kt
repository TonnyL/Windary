import org.junit.Test

class RemoveDuplicatesFromSortedArrayIITest {

    @Test
    fun testRemoveDuplicates() {
        val r = RemoveDuplicatesFromSortedArrayII()

        assert(r.removeDuplicates(intArrayOf(1, 1, 1, 2, 2, 3)) == 5)

        assert(r.removeDuplicates(intArrayOf(1, 1, 2, 2, 3)) == 5)

        assert(r.removeDuplicates(intArrayOf(1, 1)) == 2)

        assert(r.removeDuplicates(intArrayOf(1)) == 1)

        assert(r.removeDuplicates(intArrayOf(1, 1, 2)) == 3)
    }

}