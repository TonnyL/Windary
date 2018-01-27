import org.junit.Test

class DecodeWaysTest {
    
    @Test
    fun testNumDecodings() {
        val dw = DecodeWays()

        // Expected: 1, ['A']
        assert(dw.numDecodings("1") == 1)

        // Expected: 0
        assert(dw.numDecodings("0") == 0)

        // Expected: 1, ['JA']
        assert(dw.numDecodings("101") == 1)

        // Expected: 1, ['AK']
        assert(dw.numDecodings("110") == 1)

        // Expected: 1, ['JJ']
        assert(dw.numDecodings("1010") == 1)

        // Expected: 0
        assert(dw.numDecodings("012") == 0)

        // Expected: 2, ['JAA', 'JK']
        assert(dw.numDecodings("1011") == 2)

        // Expected: 2, ['AB', 'L']
        assert(dw.numDecodings("12") == 2)

        // Expected: 3, ['ABC', 'LC', 'AW']
        assert(dw.numDecodings("123") == 3)

        // Expected: 3, ['ABAT', 'LAT', 'AUT']
        assert(dw.numDecodings("12120") == 3)
    }
    
}