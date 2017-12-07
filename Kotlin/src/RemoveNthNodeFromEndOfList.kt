import java.util.Stack

/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 *
 * For example,
 *
 * Given linked list: 1->2->3->4->5, and n = 2.
 *
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
 *
 * Accepted.
 */
class RemoveNthNodeFromEndOfList {

    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var first = head
        var m = n
        val stack = Stack<ListNode>()
        var tmp: ListNode? = null
        var node = head

        while (node != null) {
            stack.push(node)
            node = node.next
        }

        while (m > 0 && !stack.empty()) {
            tmp = stack.pop()
            m--
        }

        if (tmp != null) {
            if (!stack.empty()) {
                stack.peek().next = tmp.next
            } else {
                first = tmp.next
            }
        }

        return first
    }

    class ListNode internal constructor(private var `val`: Int) {
        internal var next: ListNode? = null

        override fun toString(): String = "ListNode val: $`val` next: -> $next"
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val r = RemoveNthNodeFromEndOfList()

            val node12345 = ListNode(1)
            node12345.next = ListNode(2)
            node12345.next?.next = ListNode(3)
            node12345.next?.next?.next = ListNode(4)
            node12345.next?.next?.next?.next = ListNode(5)
            // Expected: 1->2->3->5
            println(r.removeNthFromEnd(node12345, 2))

            val node12 = ListNode(1)
            node12.next = ListNode(2)
            // Expected: 1
            println(r.removeNthFromEnd(node12, 1))

            // Expected: null
            println(r.removeNthFromEnd(ListNode(1), 1))

            // Expected: null
            println(r.removeNthFromEnd(null, 2))

            var node123: ListNode? = ListNode(1)
            node123?.next = ListNode(2)
            node123?.next?.next = ListNode(3)
            // Expected: 2->3
            node123 = r.removeNthFromEnd(node123, 3)
            println(node123)
            // Expected: 2
            println(r.removeNthFromEnd(node123, 1))
            // Expected: null
            println(r.removeNthFromEnd(node123, 1))
        }
    }

}
