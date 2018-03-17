import org.junit.Assert
import org.junit.Test

class MajorityElementTest {

    @Test
    fun majorityElement() {
        val me = MajorityElement()

        Assert.assertTrue(me.majorityElement(intArrayOf(1, 1, 2)) == 1)

        Assert.assertTrue(me.majorityElement(intArrayOf(0, 1, 1, 1, 2, 3, 1)) == 1)

        Assert.assertTrue(me.majorityElement(intArrayOf(1, 1)) == 1)
    }

}