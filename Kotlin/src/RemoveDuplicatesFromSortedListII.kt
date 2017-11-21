/**
 * Given a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list.
 *
 * For example,
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.
 *
 * Accepted.
 */
class RemoveDuplicatesFromSortedListII {

    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null) return null

        val fakeHead = ListNode(0)
        fakeHead.next = head
        var node: ListNode? = fakeHead

        while (node?.next != null) {
            var tmp = node.next
            if (tmp?.next != null && tmp.`val` == tmp.next?.`val`) {
                while (tmp?.next != null && tmp?.`val` == tmp?.next?.`val`)
                    tmp = tmp?.next
                node.next = tmp?.next
                tmp?.next = null
            } else {
                node = node.next
            }
        }
        return fakeHead.next
    }

    class ListNode internal constructor(internal var `val`: Int) {
        internal var next: ListNode? = null
        override fun toString() = "ListNode val: $`val` next: -> $next"
    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val r = RemoveDuplicatesFromSortedListII()

            // Expected: 1 -> 2 -> 5
            val node1233445 = ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3).apply {
                        next = ListNode(3).apply {
                            next = ListNode(4).apply {
                                next = ListNode(4).apply {
                                    next = ListNode(5)
                                }
                            }
                        }
                    }
                }
            }
            println(r.deleteDuplicates(node1233445))

            // Expected: 2 -> 3
            val node11123 = ListNode(1).apply {
                next = ListNode(1).apply {
                    next = ListNode(2).apply {
                        next = ListNode(3)
                    }
                }
            }
            println(r.deleteDuplicates(node11123))

            // Expected: null
            val node111 = ListNode(1).apply {
                next = ListNode(1).apply {
                    next = ListNode(1)
                }
            }
            println(r.deleteDuplicates(node111))

            // Expected: null
            println(r.deleteDuplicates(null))

            // Expected: 1
            val node122 = ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(2)
                }
            }
            println(r.deleteDuplicates(node122))

            // Expected: null
            val node11 = ListNode(1).apply {
                next = ListNode(1)
            }
            println(r.deleteDuplicates(node11))

            // Expected: null
            val node1122 = ListNode(1).apply {
                next = ListNode(1).apply {
                    next = ListNode(2).apply {
                        next = ListNode(2)
                    }
                }
            }
            println(r.deleteDuplicates(node1122))
        }
    }

}
