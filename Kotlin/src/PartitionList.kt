/**
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
 *
 * You should preserve the original relative order of the nodes in each of the two partitions.
 *
 * For example,
 * Given 1->4->3->2->5->2 and x = 3,
 * return 1->2->2->4->3->5.
 *
 * Accepted.
 */
class PartitionList {

    fun partition(head: ListNode?, x: Int): ListNode? {
        var node = head
        var greater: ListNode? = null
        var greaterHead: ListNode? = null
        var less: ListNode? = null
        var lessHead: ListNode? = null

        while (node != null) {
            if (node.`val` < x) {
                if (less == null) {
                    less = ListNode(node.`val`)
                    lessHead = less
                } else {
                    less.next = ListNode(node.`val`)
                    less = less.next
                }
            } else {
                if (greater == null) {
                    greater = ListNode(node.`val`)
                    greaterHead = greater
                } else {
                    greater.next = ListNode(node.`val`)
                    greater = greater.next
                }
            }

            node = node.next
        }

        if (greaterHead == null) {
            return lessHead
        } else if (lessHead == null) {
            return greaterHead
        }

        less?.next = greaterHead
        return lessHead
    }

    data class ListNode(
            var `val`: Int,
            var next: ListNode? = null
    )

}
