import org.junit.Test

class ReverseIntegerTest {

    @Test
    fun testReverse() {
        val ri = ReverseInteger()

        assert(ri.reverse(123) == 321)

        assert(ri.reverse(-123) == -321)

        assert(ri.reverse(1000000003) == 0)

        assert(ri.reverse(1534236469) == 0)
    }

}