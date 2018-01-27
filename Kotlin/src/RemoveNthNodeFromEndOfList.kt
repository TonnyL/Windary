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

}
