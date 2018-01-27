import org.junit.Test

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    fun testRemoveDuplicates() {
        val r = RemoveDuplicatesFromSortedArray()

        assert(r.removeDuplicates(intArrayOf()) == 0)

        assert(r.removeDuplicates(intArrayOf(1, 2, 2)) == 2)

        assert(r.removeDuplicates(intArrayOf(1, 1, 1)) == 1)

        assert(r.removeDuplicates(intArrayOf(1, 1, 2, 3, 4)) == 4)
    }

}