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

    class ListNode internal constructor(internal var `val`: Int) {

        internal var next: ListNode? = null

        override fun toString(): String = "ListNode val: $`val` next -> $next"

    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val s = SwapNodesInPairs()

            // Expected: null
            println(s.swapPairs(null))

            // Expected: 1
            println(s.swapPairs(ListNode(1)))

            // Expected: 2 -> 1
            val node12 = ListNode(1)
            node12.next = ListNode(2)
            println(s.swapPairs(node12))

            // Expected: 2 -> 1 -> 4 -> 3
            val node1234 = ListNode(1)
            node1234.next = ListNode(2)
            node1234.next?.next = ListNode(3)
            node1234.next?.next?.next = ListNode(4)
            println(s.swapPairs(node1234))

            // Expected: 2 -> 1 -> 4 -> 3 -> 5
            val node12345 = ListNode(1)
            node12345.next = ListNode(2)
            node12345.next?.next = ListNode(3)
            node12345.next?.next?.next = ListNode(4)
            node12345.next?.next?.next?.next = ListNode(5)
            println(s.swapPairs(node12345))
        }
    }

}
