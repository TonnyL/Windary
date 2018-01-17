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
        if (head == null) {
            return null
        }

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

    data class ListNode(
            var `val`: Int,
            var next: ListNode? = null
    )


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val r = RemoveDuplicatesFromSortedListII()

            // Expected: 1 -> 2 -> 5
            println(r.deleteDuplicates(ListNode(1).apply {
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
            }))

            // Expected: 2 -> 3
            println(r.deleteDuplicates(ListNode(1).apply {
                next = ListNode(1).apply {
                    next = ListNode(2).apply {
                        next = ListNode(3)
                    }
                }
            }))

            // Expected: null
            println(r.deleteDuplicates(ListNode(1).apply {
                next = ListNode(1).apply {
                    next = ListNode(1)
                }
            }))

            // Expected: null
            println(r.deleteDuplicates(null))

            // Expected: 1
            println(r.deleteDuplicates(ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(2)
                }
            }))

            // Expected: null
            println(ListNode(1).apply {
                next = ListNode(1)
            })

            // Expected: null
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
