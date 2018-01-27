import org.junit.Test

class RestoreIPAddressesTest {

    @Test
    fun testRestoreIpAddresses() {
        val r = RestoreIPAddresses()

        assert(r.restoreIpAddresses("1").isEmpty())

        assert(r.restoreIpAddresses("111").isEmpty())

        assert(r.restoreIpAddresses("1111111111111").isEmpty())

        val array0 = r.restoreIpAddresses("1111")
        assert(array0.size == 1)
        assert(array0.containsAll(listOf("1.1.1.1")))

        val array1 = r.restoreIpAddresses("25525511135")
        assert(array1.size == 2)
        assert(array1.containsAll(listOf("255.255.11.135", "255.255.111.35")))
    }

}