import org.junit.Assert
import org.junit.Test

class LinkedListCycleTest {

    @Test
    fun testHasCycle() {
        val l = LinkedListCycle()

        Assert.assertFalse(l.hasCycle(null))

        Assert.assertFalse(l.hasCycle(LinkedListCycle.ListNode(0)))

        val node0 = LinkedListCycle.ListNode(0).apply {
            next = LinkedListCycle.ListNode(1)
        }
        node0.next?.next = node0
        Assert.assertTrue(l.hasCycle(node0))

        val node1 = LinkedListCycle.ListNode(0).apply {
            next = LinkedListCycle.ListNode(1).apply {
                next = LinkedListCycle.ListNode(2).apply {
                    next = LinkedListCycle.ListNode(0)
                }
            }
        }
        Assert.assertFalse(l.hasCycle(node1))
    }

}