import org.junit.Test

class DivideTwoIntegersTest {

    @Test
    fun testDivide() {
        val d = DivideTwoIntegers()

        assert(d.divide(1, 1) == 1)

        assert(d.divide(0, 1) == 0)

        assert(d.divide(-1, -1) == 1)

        assert(d.divide(Int.MAX_VALUE, 1) == 2147483647)

        assert(d.divide(Int.MAX_VALUE, Int.MIN_VALUE) == 0)

        assert(d.divide(Int.MIN_VALUE, -1) == 2147483647)

        assert(d.divide(100, 6) == 16)
    }

}