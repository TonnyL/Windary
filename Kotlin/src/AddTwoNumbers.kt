/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 *
 * Accepted.
 */
class AddTwoNumbers {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null || l2 == null) {
            return null
        }

        var tmp1 = l1.next
        var tmp2 = l2.next

        val results = mutableListOf<ListNode>()

        var addOne = l1.`val` + l2.`val` >= 10

        var result = ListNode((l1.`val` + l2.`val`) % 10)

        if (addOne) {
            result.next = ListNode(1)
        }

        results.add(result)

        while (true) {
            if (tmp1 == null && tmp2 == null) {
                break
            } else {
                var tmp: Int = when {
                    tmp1 == null -> tmp2!!.`val`
                    tmp2 == null -> tmp1.`val`
                    else -> tmp1.`val` + tmp2.`val`
                }

                if (addOne) {
                    tmp += 1
                }

                addOne = tmp >= 10
                result = ListNode(tmp % 10)

                if (addOne) {
                    result.next = ListNode(1)
                }

                results.add(result)

                if (tmp1 != null) {
                    tmp1 = tmp1.next
                }
                if (tmp2 != null) {
                    tmp2 = tmp2.next
                }
            }

        }

        var rst: ListNode? = results[0]
        for (i in 1 until results.size) {
            rst?.next = results[i]
            rst = rst?.next
        }

        return results[0]
    }

    data class ListNode(
            var `val`: Int,
            var next: ListNode? = null
    )

}
