import org.junit.Test
import kotlin.test.assertNull

class RotateListTest {

    @Test
    fun testRotateRight() {
        val rl = RotateList()

        // Expected: null
        assertNull(rl.rotateRight(null, 1))

        // Expected: 1
        assert(rl.rotateRight(RotateList.ListNode(1), 1) == RotateList.ListNode(1))

        // Expected: 1 -> 2
        assert(rl.rotateRight(RotateList.ListNode(1).apply {
            next = RotateList.ListNode(2)
        }, 0) == RotateList.ListNode(1).apply {
            next = RotateList.ListNode(2)
        })

        // Expected: 3 -> 1 -> 2
        assert(rl.rotateRight(RotateList.ListNode(1).apply {
            next = RotateList.ListNode(2).apply {
                next = RotateList.ListNode(3)
            }
        }, 1) == RotateList.ListNode(3).apply {
            next = RotateList.ListNode(1).apply {
                next = RotateList.ListNode(2)
            }
        })

        assert(rl.rotateRight(RotateList.ListNode(1).apply {
            next = RotateList.ListNode(2).apply {
                next = RotateList.ListNode(3).apply {
                    next = RotateList.ListNode(4).apply {
                        next = RotateList.ListNode(5)
                    }
                }
            }
        }, 2) == RotateList.ListNode(4).apply {
            next = RotateList.ListNode(5).apply {
                next = RotateList.ListNode(1).apply {
                    next = RotateList.ListNode(2).apply {
                        next = RotateList.ListNode(3)
                    }
                }
            }
        })
    }

}