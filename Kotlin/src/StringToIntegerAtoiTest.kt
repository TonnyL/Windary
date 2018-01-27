import org.junit.Test

class StringToIntegerAtoiTest {

    @Test
    fun testMyAtoi() {
        val atoi = StringToIntegerAtoi()

        assert(atoi.myAtoi("+-1") == 0)

        assert(atoi.myAtoi("-00123a66") == -123)

        assert(atoi.myAtoi("-1") == -1)

        assert(atoi.myAtoi("    10522545459") == 2147483647)

        assert(atoi.myAtoi("-2147483647") == -2147483647)

        assert(atoi.myAtoi("2147483648") == 2147483647)

        assert(atoi.myAtoi("-2147483649") == -2147483648)

        assert(atoi.myAtoi("2147483647") == 2147483647)
    }

}