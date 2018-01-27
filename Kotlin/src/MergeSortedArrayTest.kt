import org.junit.Test

class MergeSortedArrayTest {

    @Test
    fun testMerge() {
        val msa = MergeSortedArray()

        val array0 = intArrayOf(1)
        msa.merge(array0, 1, intArrayOf(), 0)
        assert(array0.contentEquals(intArrayOf(1)))

        val array1 = intArrayOf(0)
        msa.merge(array1, 0, intArrayOf(1), 1)
        assert(array1.contentEquals(intArrayOf(1)))

        val array2 = intArrayOf(4, 5, 6, 0, 0, 0)
        msa.merge(array2, 3, intArrayOf(1, 2, 3), 3)
        assert(array2.contentEquals(intArrayOf(1, 2, 3, 4, 5, 6)))

        val array3 = intArrayOf(0, 0, 0, 1, 2, 3, -1, -1, -1)
        msa.merge(array3, 6, intArrayOf(0, 4), 2)
        assert(array3.contentEquals(intArrayOf(0, 0, 0, 0, 1, 2, 3, 4, -1)))

        val array4 = intArrayOf(0, 1, 2, 3, 0, 0, 0, 0, 0)
        msa.merge(array4, 4, intArrayOf(3, 4, 0), 2)
        assert(array4.contentEquals(intArrayOf(0, 1, 2, 3, 3, 4, 0, 0, 0)))

        val array5 = intArrayOf(1, 2, 0, 0)
        msa.merge(array5, 2, intArrayOf(1), 1)
        assert(array5.contentEquals(intArrayOf(1, 1, 2, 0)))

        val array6 = intArrayOf(1, 2, 3, 0, 0, 0)
        msa.merge(array6, 3, intArrayOf(2, 5, 6), 3)
        assert(array6.contentEquals(intArrayOf(1, 2, 2, 3, 5, 6)))
    }

}