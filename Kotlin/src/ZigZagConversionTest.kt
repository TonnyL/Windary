import org.junit.Test

class ZigZagConversionTest {

    @Test
    fun testConvert() {
        val z = ZigZagConversion()

        assert(z.convert("0123456789", 1) == "0123456789")

        assert(z.convert("PAYPALISHIRING", 3) == "PAHNAPLSIIGYIR")

        assert(z.convert("0123456789", 2) == "0246813579")

        assert(z.convert("0123456789", 3) == "0481357926")
    }

}