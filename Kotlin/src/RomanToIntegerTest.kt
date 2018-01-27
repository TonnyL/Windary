import org.junit.Test

class RomanToIntegerTest {

    @Test
    fun testRomanToInt() {
        val rtt = RomanToInteger()
        // Expected: 621 = 500 + 100 + 10 + 10 +1
        assert(rtt.romanToInt("DCXXI") == 621)
        // Expected: 1996 = 1000 - (100 - 1000) - (10 - 100) + 5 + 1
        assert(rtt.romanToInt("MCMXCVI") == 1996)
        // Expected: 999 = - (100 - 1000) - (10 - 100) - (1 - 10)
        assert(rtt.romanToInt("CMXCIX") == 999)
    }

}