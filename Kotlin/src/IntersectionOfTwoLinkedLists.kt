/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 *
 * For example, the following two linked lists:
 * `
 * A:          a1 → a2
 *                     ↘
 *                     c1 → c2 → c3
 *                     ↗
 * B:     b1 → b2 → b3
 * `
 * begin to intersect at node c1.
 *
 * Notes:
 *
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 *
 * Waiting to be judged.
 */
class IntersectionOfTwoLinkedLists {

    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        if (headA == null || headB == null) {
            return null
        }

        var a = headA
        var b = headB
        while (a !== b) {
            a = if (a != null) a.next else headB
            b = if (b != null) b.next else headA
        }

        return a
    }

    data class ListNode(
            val `val`: Int,
            var next: ListNode? = null
    )

}
