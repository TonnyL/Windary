import org.junit.Test

class SortColorsTest {

    @Test
    fun testSortColors() {
        val sc = SortColors()

        val array0 = intArrayOf()
        sc.sortColors(array0)
        assert(array0.isEmpty())

        val array1 = intArrayOf(0)
        sc.sortColors(array1)
        assert(array1.contentEquals(intArrayOf(0)))

        val array2 = intArrayOf(2, 1, 0)
        sc.sortColors(array2)
        assert(array2.contentEquals(intArrayOf(0, 1, 2)))

        val array3 = intArrayOf(0, 1, 0, 1, 1, 1, 2, 0, 1)
        sc.sortColors(array3)
        assert(array3.contentEquals(intArrayOf(0, 0, 0, 1, 1, 1, 1, 1, 2)))

        val array4 = intArrayOf(0, 1, 2, 0, 1)
        sc.sortColors(array4)
        assert(array4.contentEquals(intArrayOf(0, 0, 1, 1, 2)))

        val array5 = intArrayOf(2, 2, 2, 2, 1, 0, 2, 0, 1)
        sc.sortColors(array5)
        assert(array5.contentEquals(intArrayOf(0, 0, 1, 1, 2, 2, 2, 2, 2)))

        val array6 = intArrayOf(0, 0, 1, 1, 1, 2, 2, 2)
        sc.sortColors(array6)
        assert(array6.contentEquals(intArrayOf(0, 0, 1, 1, 1, 2, 2, 2)))

        val array7 = intArrayOf(0, 0, 0, 2, 2, 2, 1, 1, 1)
        sc.sortColors(array7)
        assert(array7.contentEquals(intArrayOf(0, 0, 0, 1, 1, 1, 2, 2, 2)))
    }

}