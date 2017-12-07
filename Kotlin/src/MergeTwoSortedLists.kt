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
                result!!.next = ListNode(node2.`val`)
                node2 = node2.next
            }
            result = result?.next
        }

        result?.next = if (node1 == null) node2 else node1

        return fakeHeader!!.next
    }

    class ListNode internal constructor(internal var `val`: Int) {
        internal var next: ListNode? = null

        override fun toString(): String = "ListNode val: $`val` next: -> $next"
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val m = MergeTwoSortedLists()

            val node1 = ListNode(1)
            node1.next = ListNode(2)
            node1.next!!.next = ListNode(4)

            val node2 = ListNode(1)
            node2.next = ListNode(3)
            node2.next!!.next = ListNode(4)

            // Expected: 1->1->2->3->4->4
            println(m.mergeTwoLists(node1, node2))

            // Expected: 1->2->4
            println(m.mergeTwoLists(node1, null))

            // Expected: 1->3->4
            println(m.mergeTwoLists(null, node2))

            // Expected: null
            println(m.mergeTwoLists(null, null))
        }
    }

}
