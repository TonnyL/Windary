import org.junit.Assert
import org.junit.Test

class ToLowerCaseTest {

    @Test
    fun testToLowerCase() {
        val tlc = ToLowerCase()

        Assert.assertEquals(tlc.toLowerCase("Hello"), "hello")
        Assert.assertEquals(tlc.toLowerCase("here"), "here")
        Assert.assertEquals(tlc.toLowerCase("LOVELY"), "lovely")
    }

}
