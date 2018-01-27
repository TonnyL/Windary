import org.junit.Test

class AddTwoNumbersTest {

    @Test
    fun testAddTwoNumbers() {
        val atn = AddTwoNumbers()

        val node0 = AddTwoNumbers.ListNode(0)
        val node5 = AddTwoNumbers.ListNode(5)
        assert(atn.addTwoNumbers(node0, node0) == AddTwoNumbers.ListNode(0))
        assert(atn.addTwoNumbers(node5, node5) == AddTwoNumbers.ListNode(0).apply {
            next = AddTwoNumbers.ListNode(1)
        })

        val node243 = AddTwoNumbers.ListNode(2).apply {
            next = AddTwoNumbers.ListNode(4).apply {
                next = AddTwoNumbers.ListNode(3)
            }
        }

        val node564 = AddTwoNumbers.ListNode(5).apply {
            next = AddTwoNumbers.ListNode(6).apply {
                next = AddTwoNumbers.ListNode(4)
            }
        }

        assert(atn.addTwoNumbers(node243, node564) == AddTwoNumbers.ListNode(7).apply {
            next = AddTwoNumbers.ListNode(0).apply {
                next = AddTwoNumbers.ListNode(8)
            }
        })

        val node1 = AddTwoNumbers.ListNode(1)
        val node99 = AddTwoNumbers.ListNode(9).apply {
            next = AddTwoNumbers.ListNode(9)
        }

        assert(atn.addTwoNumbers(node1, node99) == AddTwoNumbers.ListNode(0).apply {
            next = AddTwoNumbers.ListNode(0).apply {
                next = AddTwoNumbers.ListNode(1)
            }
        })
    }

}