/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 * Accepted.
 */
class RemoveDuplicatesFromSortedList {

    fun deleteDuplicates(head: ListNode?): ListNode? {
        var node = head
        while (node != null && node.next != null) {
            if (node.`val` == node.next?.`val`) {
                val tmp = node.next
                node.next = tmp?.next
                tmp?.next = null
            } else {
                node = node.next
            }
        }
        return head
    }

    data class ListNode(
            var `val`: Int,
            var next: ListNode? = null
    )

}
