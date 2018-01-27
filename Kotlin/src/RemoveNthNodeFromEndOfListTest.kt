import org.junit.Test
import kotlin.test.assertNull

class RemoveNthNodeFromEndOfListTest {

    @Test
    fun testRemoveNthFromEnd() {
        val r = RemoveNthNodeFromEndOfList()

        assert(r.removeNthFromEnd(RemoveNthNodeFromEndOfList.ListNode(1).apply {
            next = RemoveNthNodeFromEndOfList.ListNode(2).apply {
                next = RemoveNthNodeFromEndOfList.ListNode(3).apply {
                    next = RemoveNthNodeFromEndOfList.ListNode(4).apply {
                        next = RemoveNthNodeFromEndOfList.ListNode(5)
                    }
                }
            }
        }, 2) == RemoveNthNodeFromEndOfList.ListNode(1).apply {
            next = RemoveNthNodeFromEndOfList.ListNode(2).apply {
                next = RemoveNthNodeFromEndOfList.ListNode(3).apply {
                    next = RemoveNthNodeFromEndOfList.ListNode(5)
                }
            }
        })

        assert(r.removeNthFromEnd(RemoveNthNodeFromEndOfList.ListNode(1).apply {
            next = RemoveNthNodeFromEndOfList.ListNode(2)
        }, 1) == RemoveNthNodeFromEndOfList.ListNode(1))

        assertNull(r.removeNthFromEnd(RemoveNthNodeFromEndOfList.ListNode(1), 1))

        assertNull(r.removeNthFromEnd(null, 2))

        val node123: RemoveNthNodeFromEndOfList.ListNode? = r.removeNthFromEnd(RemoveNthNodeFromEndOfList.ListNode(1).apply {
            next = RemoveNthNodeFromEndOfList.ListNode(2).apply {
                next = RemoveNthNodeFromEndOfList.ListNode(3)
            }
        }, 3)
        assert(node123 == RemoveNthNodeFromEndOfList.ListNode(2).apply {
            next = RemoveNthNodeFromEndOfList.ListNode(3)
        })

        assert(r.removeNthFromEnd(node123, 1) == RemoveNthNodeFromEndOfList.ListNode(2))

        assertNull(r.removeNthFromEnd(node123, 1))
    }

}