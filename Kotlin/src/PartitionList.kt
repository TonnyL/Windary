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

    class ListNode internal constructor(internal var `val`: Int) {

        internal var next: ListNode? = null

        override fun toString(): String = "ListNode val: $`val` next -> $next"
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val pl = PartitionList()

            // Expected: null
            println(pl.partition(null, 2))

            // Expected: 1 -> 2
            val node12 = ListNode(1)
            node12.next = ListNode(2)
            println(pl.partition(node12, 3))

            // Expected: 1 -> 2
            println(pl.partition(node12, 0))

            val node143252 = ListNode(1)
            node143252.next = ListNode(4)
            node143252.next?.next = ListNode(3)
            node143252.next?.next?.next = ListNode(2)
            node143252.next?.next?.next?.next = ListNode(5)
            node143252.next?.next?.next?.next?.next = ListNode(2)
            // Expected: 1 -> 2 -> 2 -> 4 -> 3 -> 5
            println(pl.partition(node143252, 3))

            // Expected: 1 -> 3 -> 2 -> 2 -> 4 -> 5
            println(pl.partition(node143252, 4))
        }
    }

}
