import org.junit.Assert
import org.junit.Test

class LinkedListCycleIITest {

    @Test
    fun testDetectCycle() {
        val l = LinkedListCycleII()

        Assert.assertNull(l.detectCycle(null))

        Assert.assertNull(l.detectCycle(LinkedListCycleII.ListNode(0)))
    }

}