import org.junit.Test

class NextPermutationTest {

    @Test
    fun testNextPermutation() {
        val np = NextPermutation()

        val array123 = intArrayOf(1, 2, 3)
        np.nextPermutation(array123)
        assert(array123.contentEquals(intArrayOf(1, 3, 2)))

        val array321 = intArrayOf(3, 2, 1)
        np.nextPermutation(array321)
        assert(array321.contentEquals(intArrayOf(1, 2, 3)))

        val array115 = intArrayOf(1, 1, 5)
        np.nextPermutation(array115)
        assert(array115.contentEquals(intArrayOf(1, 5, 1)))
    }

}