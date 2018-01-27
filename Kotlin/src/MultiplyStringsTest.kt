import org.junit.Test

class MultiplyStringsTest {
    @Test
    fun testMultiply() {
        val ms = MultiplyStrings()

        assert(ms.multiply("", "") == "0")

        assert(ms.multiply("0", "0") == "0")

        assert(ms.multiply("100", "1") == "100")

        assert(ms.multiply("123", "45") == "5535")

        assert(ms.multiply("99", "99") == "9801")

        assert(ms.multiply("123", "123") == "15129")

        assert(ms.multiply("123456789", "123456789") == "15241578750190521")
    }
}