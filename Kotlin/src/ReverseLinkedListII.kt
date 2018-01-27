/**
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 *
 * For example:
 * Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 *
 * return 1->4->3->2->5->NULL.
 *
 * Note:
 * Given m, n satisfy the following condition:
 * 1 ≤ m ≤ n ≤ length of list.
 *
 * Accepted.
 */
class ReverseLinkedListII {

    fun reverseBetween(head: ListNode?, m: Int, n: Int): ListNode? {
        var node = head
        val list = mutableListOf<ListNode>()

        var i = 0
        while (i <= n - 1 && node != null) {
            if (m - 1 <= i) {
                list.add(node)
            }
            node = node.next
            i++
        }

        while (list.size >= 2) {
            val tmp = list[0].`val`
            list[0].`val` = list[list.size - 1].`val`
            list[list.size - 1].`val` = tmp

            list.removeAt(0)
            list.removeAt(list.size - 1)
        }

        return head
    }

    data class ListNode(
            var `val`: Int,
            var next: ListNode? = null
    )

}
