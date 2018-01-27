import org.junit.Test

class SqrtXTest {

    @Test
    fun testMySqrt() {
        val sx = SqrtX()
        
        assert(sx.mySqrt(0) == 0)

        assert(sx.mySqrt(1) == 1)

        assert(sx.mySqrt(2147395599) == 46339)

        assert(sx.mySqrt(2147395600) == 46340)

        assert(sx.mySqrt(6) == 2)
    }

}