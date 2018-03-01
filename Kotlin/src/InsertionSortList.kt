/**
 * Sort a linked list using insertion sort.
 *
 * Accepted.
 */
class InsertionSortList {

    fun insertionSortList(head: ListNode?): ListNode? {
        var node = head
        val fakeHead = ListNode(0)

        while (node != null) {
            var pre: ListNode? = fakeHead

            while (pre?.next != null && pre.next?.`val`!! <= node.`val`) {
                pre = pre.next
            }

            val headNext = node.next
            node.next = pre?.next

            pre?.next = node
            node = headNext
        }

        return fakeHead.next
    }

    data class ListNode(
            var `val`: Int,
            var next: ListNode? = null
    )

}
