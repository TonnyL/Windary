import org.junit.Test
import kotlin.test.assertNull

class ReverseLinkedListIITest {

    @Test
    fun testReverseBetween() {
        val r = ReverseLinkedListII()

        assertNull(r.reverseBetween(null, 1, 2))

        assert(r.reverseBetween(ReverseLinkedListII.ListNode(1).apply {
            next = ReverseLinkedListII.ListNode(2).apply {
                next = ReverseLinkedListII.ListNode(3)
            }
        }, 2, 3) == ReverseLinkedListII.ListNode(1).apply {
            next = ReverseLinkedListII.ListNode(3).apply {
                next = ReverseLinkedListII.ListNode(2)
            }
        })

        assert(r.reverseBetween(ReverseLinkedListII.ListNode(1), 1, 1) == ReverseLinkedListII.ListNode(1))

        assert(r.reverseBetween(ReverseLinkedListII.ListNode(1).apply {
            next = ReverseLinkedListII.ListNode(2)
        }, 1, 2) == ReverseLinkedListII.ListNode(2).apply {
            next = ReverseLinkedListII.ListNode(1)
        })

        assert(r.reverseBetween(ReverseLinkedListII.ListNode(1).apply {
            next = ReverseLinkedListII.ListNode(2).apply {
                next = ReverseLinkedListII.ListNode(3).apply {
                    next = ReverseLinkedListII.ListNode(4).apply {
                        next = ReverseLinkedListII.ListNode(5)
                    }
                }
            }
        }, 2, 4) == ReverseLinkedListII.ListNode(1).apply {
            next = ReverseLinkedListII.ListNode(4).apply {
                next = ReverseLinkedListII.ListNode(3).apply {
                    next = ReverseLinkedListII.ListNode(2).apply {
                        next = ReverseLinkedListII.ListNode(5)
                    }
                }
            }
        })
    }

}