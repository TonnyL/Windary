import org.junit.Test
import kotlin.test.assertNull

class SwapNodesInPairsTest {

    @Test
    fun testSwapPairs() {
        val s = SwapNodesInPairs()

        assertNull(s.swapPairs(null))

        assert(s.swapPairs(SwapNodesInPairs.ListNode(1)) == SwapNodesInPairs.ListNode(1))

        assert(s.swapPairs(SwapNodesInPairs.ListNode(1).apply {
            next = SwapNodesInPairs.ListNode(2)
        }) == SwapNodesInPairs.ListNode(2).apply {
            next = SwapNodesInPairs.ListNode(1)
        })

        assert(s.swapPairs(SwapNodesInPairs.ListNode(1).apply {
            next = SwapNodesInPairs.ListNode(2).apply {
                next = SwapNodesInPairs.ListNode(3).apply {
                    next = SwapNodesInPairs.ListNode(4)
                }
            }
        }) == SwapNodesInPairs.ListNode(2).apply {
            next = SwapNodesInPairs.ListNode(1).apply {
                next = SwapNodesInPairs.ListNode(4).apply {
                    next = SwapNodesInPairs.ListNode(3)
                }
            }
        })

        assert(s.swapPairs(SwapNodesInPairs.ListNode(1).apply {
            next = SwapNodesInPairs.ListNode(2).apply {
                next = SwapNodesInPairs.ListNode(3).apply {
                    next = SwapNodesInPairs.ListNode(4).apply {
                        next = SwapNodesInPairs.ListNode(5)
                    }
                }
            }
        }) == SwapNodesInPairs.ListNode(2).apply {
            next = SwapNodesInPairs.ListNode(1).apply {
                next = SwapNodesInPairs.ListNode(4).apply {
                    next = SwapNodesInPairs.ListNode(3).apply {
                        next = SwapNodesInPairs.ListNode(5)
                    }
                }
            }
        })
    }

}