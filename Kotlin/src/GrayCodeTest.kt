import org.junit.Test

class GrayCodeTest {

    @Test
    fun testGrayCode() {
        val gc = GrayCode()
        
        assert(gc.grayCode(0) == listOf(0))

        assert(gc.grayCode(2) == listOf(0, 1, 3, 2))

        assert(gc.grayCode(3) == listOf(0, 1, 3, 2, 6, 7, 5, 4))
    }

}