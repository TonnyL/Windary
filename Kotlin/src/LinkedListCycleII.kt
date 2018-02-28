/**
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 *
 * Note: Do not modify the linked list.
 *
 * Follow up:
 * Can you solve it without using extra space?
 *
 * Waiting to be judged.
 */
class LinkedListCycleII {

    fun detectCycle(head: ListNode?): ListNode? {
        var h = head
        var slow = head
        var fast = head
        while (fast != null && fast.next != null) {
            slow = slow?.next
            fast = fast.next?.next
            if (slow === fast) {
                while (slow !== head) {
                    h = head?.next
                    slow = slow?.next
                }
                return h
            }
        }
        return null
    }

    data class ListNode(
            val `val`: Int,
            var next: ListNode? = null
    )

}
