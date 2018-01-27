import org.junit.Test

class AddBinaryTest {

    @Test
    fun testAddBinary() {
        val ab = AddBinary()

        assert(ab.addBinary("0", "0") == "0")

        assert(ab.addBinary("11", "1") == "100")

        assert(ab.addBinary("101", "101") == "1010")
    }

}