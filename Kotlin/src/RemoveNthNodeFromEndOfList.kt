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

    data class ListNode(
            private var `val`: Int,
            var next: ListNode? = null
    )

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val r = RemoveNthNodeFromEndOfList()

            // Expected: 1->2->3->5
            println(r.removeNthFromEnd(ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3).apply {
                        next = ListNode(4).apply {
                            next = ListNode(5)
                        }
                    }
                }
            }, 2))

            // Expected: 1
            println(r.removeNthFromEnd(ListNode(1).apply {
                next = ListNode(2)
            }, 1))

            // Expected: null
            println(r.removeNthFromEnd(ListNode(1), 1))

            // Expected: null
            println(r.removeNthFromEnd(null, 2))

            // Expected: 2->3
            val node123: ListNode? = r.removeNthFromEnd(ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3)
                }
            }, 3)
            println(node123)
            // Expected: 2
            println(r.removeNthFromEnd(node123, 1))
            // Expected: null
            println(r.removeNthFromEnd(node123, 1))
        }
    }

}
