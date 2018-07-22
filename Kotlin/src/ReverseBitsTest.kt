import org.junit.Assert
import org.junit.Test

class ReverseBitsTest {

    @Test
    fun testReverseBits() {
        val rb = ReverseBits()

        Assert.assertEquals(0, rb.reverseBits(0).toLong())

        Assert.assertEquals(43261596, rb.reverseBits(964176192))
    }

}
