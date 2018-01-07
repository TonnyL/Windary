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

    data class ListNode(var `val`: Int,
                        var next: ListNode? = null)

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val r = ReverseLinkedListII()

            // Expected: null
            println(r.reverseBetween(null, 1, 2))

            val node123 = ListNode(1)
            node123.next = ListNode(2)
            node123.next?.next = ListNode(3)
            // Expected: 1 -> 3 -> 2
            println(r.reverseBetween(node123, 2, 3))

            // Expected: 1
            println(r.reverseBetween(ListNode(1), 1, 1))

            val node12 = ListNode(1)
            node12.next = ListNode(2)
            // Expected: 2 -> 1
            println(r.reverseBetween(node12, 1, 2))

            val node12345 = ListNode(1)
            node12345.next = ListNode(2)
            node12345.next?.next = ListNode(3)
            node12345.next?.next?.next = ListNode(4)
            node12345.next?.next?.next?.next = ListNode(5)
            // Expected: 1 -> 4 -> 3 -> 2 -> 5
            println(r.reverseBetween(node12345, 2, 4))
        }
    }

}
