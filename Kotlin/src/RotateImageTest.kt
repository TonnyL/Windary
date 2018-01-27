import org.junit.Test

class RotateImageTest {

    @Test
    fun testRotate() {
        val ri = RotateImage()

        val array0 = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
        ri.rotate(array0)
        assert(array0.size == 3)
        assert(array0[0].contentEquals(intArrayOf(7, 4, 1)))
        assert(array0[1].contentEquals(intArrayOf(8, 5, 2)))
        assert(array0[2].contentEquals(intArrayOf(9, 6, 3)))

        val array1 = arrayOf(intArrayOf(5, 1, 9, 11), intArrayOf(2, 4, 8, 10), intArrayOf(13, 3, 6, 7), intArrayOf(15, 14, 12, 16))
        ri.rotate(array1)
        assert(array1.size == 4)
        assert(array1[0].contentEquals(intArrayOf(15, 13, 2, 5)))
        assert(array1[1].contentEquals(intArrayOf(14, 3, 4, 1)))
        assert(array1[2].contentEquals(intArrayOf(12, 6, 8, 9)))
        assert(array1[3].contentEquals(intArrayOf(16, 7, 10, 11)))
    }

}