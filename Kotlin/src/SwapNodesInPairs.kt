/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 *
 * Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 *
 * Accepted.
 */
class SwapNodesInPairs {

    fun swapPairs(head: ListNode?): ListNode? {
        if (head?.next == null) {
            return head
        }
        var pre = head
        var nxt = pre.next
        while (pre != null && nxt != null) {
            val tmp = nxt.`val`
            nxt.`val` = pre.`val`
            pre.`val` = tmp

            pre = nxt.next
            nxt = pre?.next
        }

        return head
    }

    data class ListNode(
            var `val`: Int,
            var next: ListNode? = null
    )

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val s = SwapNodesInPairs()

            // Expected: null
            println(s.swapPairs(null))

            // Expected: 1
            println(s.swapPairs(ListNode(1)))

            // Expected: 2 -> 1
            println(s.swapPairs(ListNode(1).apply {
                next = ListNode(2)
            }))

            // Expected: 2 -> 1 -> 4 -> 3
            println(s.swapPairs(ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3).apply {
                        next = ListNode(4)
                    }
                }
            }))

            // Expected: 2 -> 1 -> 4 -> 3 -> 5
            println(s.swapPairs(ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3).apply {
                        next = ListNode(4).apply {
                            next = ListNode(5)
                        }
                    }
                }
            }))
        }
    }

}
