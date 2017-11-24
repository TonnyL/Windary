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
            if (node.`val` == node.next!!.`val`) {
                val tmp = node.next
                node.next = tmp!!.next
                tmp.next = null
            } else {
                node = node.next
            }
        }
        return head
    }

    class ListNode internal constructor(internal var `val`: Int) {
        internal var next: ListNode? = null
        override fun toString() = "ListNode val: $`val` next: -> $next"
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val r = RemoveDuplicatesFromSortedList()

            // Expected: null
            println(r.deleteDuplicates(null))

            // Expected: 1 -> 2
            println(r.deleteDuplicates(ListNode(1).apply {
                this.next = ListNode(1).apply {
                    this.next = ListNode(2)
                }
            }))

            // Expected: 1 -> 2 -> 3
            println(r.deleteDuplicates(ListNode(1).apply {
                this.next = ListNode(1).apply {
                    this.next = ListNode(2).apply {
                        this.next = ListNode(3).apply {
                            this.next = ListNode(3)
                        }
                    }
                }
            }))

            // Expected: 1
            println(r.deleteDuplicates(ListNode(1).apply {
                next = ListNode(1).apply {
                    next = ListNode(1)
                }
            }))

            // Expected: 1 -> 2
            println(r.deleteDuplicates(ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(2).apply {
                        next = ListNode(2)
                    }
                }
            }))

            // Expected: 1 -> 2
            println(r.deleteDuplicates(ListNode(1).apply {
                next = ListNode(1).apply {
                    next = ListNode(2).apply {
                        next = ListNode(2)
                    }
                }
            }))
        }
    }

}