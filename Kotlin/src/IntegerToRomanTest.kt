import org.junit.Test

class IntegerToRomanTest {

    @Test
    fun testIntToRoman() {
        val i = IntegerToRoman()

        assert(i.intToRoman(1) == "I")

        assert(i.intToRoman(621) == "DCXXI")

        assert(i.intToRoman(1996) == "MCMXCVI")

        assert(i.intToRoman(999) == "CMXCIX")
    }

}