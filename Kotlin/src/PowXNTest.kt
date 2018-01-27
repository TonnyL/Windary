import org.junit.Test

class PowXNTest {

    @Test
    fun testMyPow() {
        val pxn = PowXN()

        assert(pxn.myPow(2.0, 2) == 4.0)

        assert("%.5f".format(pxn.myPow(8.88023, 3)) == "700.28148")

        assert(pxn.myPow(2.0, -2) == 0.25)

        assert(pxn.myPow(0.00001, 2147483647) == 0.0)

        assert("%.5f".format(pxn.myPow(34.00515, -3)) == "0.00003")
    }

}