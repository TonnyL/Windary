import org.junit.Test

class CountAndSayTest {

    @Test
    fun testCountAndSay() {
        val cas = CountAndSay()
        
        assert(cas.countAndSay(1) == "1")

        assert(cas.countAndSay(2) == "11")

        assert(cas.countAndSay(3) == "21")
         
        assert(cas.countAndSay(4) == "1211")
         
        assert(cas.countAndSay(5) == "111221")
        
        assert(cas.countAndSay(6) == "312211")
    }

}