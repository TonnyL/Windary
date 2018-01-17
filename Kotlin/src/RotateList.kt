/**
 * Given a list, rotate the list to the right by k places, where k is non-negative.
 *
 * Example:
 *
 * Given 1->2->3->4->5->NULL and k = 2,
 *
 * return 4->5->1->2->3->NULL.
 *
 * Accepted.
 */
class RotateList {

    fun rotateRight(head: ListNode?, k: Int): ListNode? {
        var anotherHead = head
        var anotherK = k
        if (anotherHead == null || anotherHead.next == null) {
            return head
        }

        var node = anotherHead
        var length = 1
        while (node?.next != null) {
            length++

            node = node.next
        }

        node?.next = anotherHead // Form a circle
        anotherK %= length

        for (i in 0 until length - anotherK) {
            node = node?.next
        }
        anotherHead = node?.next
        node?.next = null

        return anotherHead
    }

    data class ListNode(
            var `val`: Int,
            var next: ListNode? = null
    )

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val rl = RotateList()

            // Expected: null
            println(rl.rotateRight(null, 1))

            // Expected: 1
            println(rl.rotateRight(ListNode(1), 1))

            // Expected: 1 -> 2
            println(rl.rotateRight(ListNode(1).apply {
                next = ListNode(2)
            }, 0))

            // Expected: 3 -> 1 -> 2
            println(rl.rotateRight(ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3)
                }
            }, 1))

            println(rl.rotateRight(ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3).apply {
                        next = ListNode(4).apply {
                            next = ListNode(5)
                        }
                    }
                }
            }, 2))
        }
    }

}
