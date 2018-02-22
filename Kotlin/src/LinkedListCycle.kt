/**
 * Given a linked list, determine if it has a cycle in it.
 *
 * Follow up:
 * Can you solve it without using extra space?
 */
class LinkedListCycle {

    // Waiting to be judged.
    fun hasCycle(head: ListNode?): Boolean {
        if (head?.next == null) {
            return false
        }
        var node = head.next
        while (node != head) {
            if (node == null) {
                return false
            }
            node = node.next
        }
        return true
    }

    // Waiting to be judged.
    /*fun hasCycle(head: ListNode?): Boolean {
        var slow = head
        var fast = head
        while (fast != null && fast.next != null) {
            slow = slow?.next
            fast = fast.next?.next
            if (slow === fast) {
                return true
            }
        }
        return false
    }*/

    data class ListNode(
            val `val`: Int,
            var next: ListNode? = null
    )

}
