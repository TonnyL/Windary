/**
 * Sort a linked list in O(n log n) time using constant space complexity.
 *
 * Accepted.
 */
class SortList {

    fun sortList(head: ListNode?): ListNode? {
        if (head?.next == null) {
            return head
        }

        var slow = head
        var fast = head
        var pre = head

        while (fast != null && fast.next != null) {
            pre = slow
            slow = slow?.next
            fast = fast.next?.next
        }
        pre?.next = null
        return merge(sortList(head), sortList(slow))
    }

    private fun merge(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null) {
            return l2
        }
        if (l2 == null) {
            return l1
        }
        if (l1.`val` < l2.`val`) {
            l1.next = merge(l1.next, l2)
            return l1
        }
        l2.next = merge(l1, l2.next)
        return l2
    }

    data class ListNode(
            var `val`: Int,
            var next: ListNode? = null
    )

}
