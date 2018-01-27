/**
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 *
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 *
 * Accepted.
 */
class MergeTwoSortedLists {

    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var node1 = l1
        var node2 = l2
        var result: ListNode? = ListNode(0)
        val fakeHeader = result

        while (node1 != null && node2 != null) {
            if (node1.`val` <= node2.`val`) {
                result?.next = ListNode(node1.`val`)
                node1 = node1.next
            } else {
                result?.next = ListNode(node2.`val`)
                node2 = node2.next
            }
            result = result?.next
        }

        result?.next = if (node1 == null) node2 else node1

        return fakeHeader?.next
    }

    data class ListNode(
            var `val`: Int,
            var next: ListNode? = null
    )

}
