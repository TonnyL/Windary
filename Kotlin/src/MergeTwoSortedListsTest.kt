import org.junit.Test
import kotlin.test.assertNull

class MergeTwoSortedListsTest {

    @Test
    fun testMergeTwoLists() {
        val m = MergeTwoSortedLists()

        val node1 = MergeTwoSortedLists.ListNode(1).apply {
            next = MergeTwoSortedLists.ListNode(2).apply {
                next = MergeTwoSortedLists.ListNode(4)
            }
        }

        val node2 = MergeTwoSortedLists.ListNode(1).apply {
            next = MergeTwoSortedLists.ListNode(3).apply {
                next = MergeTwoSortedLists.ListNode(4)
            }
        }

        assert(m.mergeTwoLists(node1, node2)?.equals(
                MergeTwoSortedLists.ListNode(1).apply {
                    next = MergeTwoSortedLists.ListNode(1).apply {
                        next = MergeTwoSortedLists.ListNode(2).apply {
                            next = MergeTwoSortedLists.ListNode(3).apply {
                                next = MergeTwoSortedLists.ListNode(4).apply {
                                    next = MergeTwoSortedLists.ListNode(4)
                                }
                            }
                        }
                    }
                }
        ) == true)

        assert(m.mergeTwoLists(node1, null)?.equals(
                MergeTwoSortedLists.ListNode(1).apply {
                    next = MergeTwoSortedLists.ListNode(2).apply {
                        next = MergeTwoSortedLists.ListNode(4)
                    }
                }
        ) == true)

        assert(m.mergeTwoLists(null, node2)?.equals(
                MergeTwoSortedLists.ListNode(1).apply {
                    next = MergeTwoSortedLists.ListNode(3).apply {
                        next = MergeTwoSortedLists.ListNode(4)
                    }
                }
        ) == true)

        assertNull(m.mergeTwoLists(null, null))
    }

}