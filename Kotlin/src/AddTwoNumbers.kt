import java.util.ArrayList

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

        if (l1 == null || l2 == null) return null

        var tmp1 = l1.next
        var tmp2 = l2.next

        val results = ArrayList<ListNode>()

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
                var tmp = 0
                tmp = when {
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
            rst!!.next = results[i]
            rst = rst.next
        }

        return results[0]
    }

    /**
     * Definition for singly-linked list.
     */
    class ListNode internal constructor(internal var `val`: Int) {
        internal var next: ListNode? = null
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            val node0 = ListNode(0)
            val node5 = ListNode(5)

            val node243 = ListNode(2)
            node243.next = ListNode(4)
            node243.next!!.next = ListNode(3)

            val node564 = ListNode(5)
            node564.next = ListNode(6)
            node564.next!!.next = ListNode(4)

            val node1 = ListNode(1)
            val node99 = ListNode(9)
            node99.next = ListNode(9)

            val atn = AddTwoNumbers()
            val result0 = atn.addTwoNumbers(node0, node0)
            val result5 = atn.addTwoNumbers(node5, node5)
            val result243And564 = atn.addTwoNumbers(node243, node564)
            val result1And99 = atn.addTwoNumbers(node1, node99)

            println("result: [0] + [0] -> " + result0?.`val`)
            println("result: [5] + [5] -> " + result5?.`val` + " -> " + result5?.next?.`val`)
            println("result: [2,4,3] + [5,6,4] -> " + result243And564?.`val` + " -> " + result243And564?.next?.`val` + " -> " + result243And564?.next?.next?.`val`)
            println("result: [1] + [9,9] -> " + result1And99?.`val` + " -> " + result1And99?.next!!.`val` + " -> " + result1And99.next?.next?.`val`)

        }
    }

}
