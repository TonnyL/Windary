import org.junit.Test
import kotlin.test.assertNull

class RemoveDuplicatesFromSortedListIITest {

    @Test
    fun testDeleteDuplicates() {
        val r = RemoveDuplicatesFromSortedListII()

        // Expected: 1 -> 2 -> 5
        assert(r.deleteDuplicates(RemoveDuplicatesFromSortedListII.ListNode(1).apply {
            next = RemoveDuplicatesFromSortedListII.ListNode(2).apply {
                next = RemoveDuplicatesFromSortedListII.ListNode(3).apply {
                    next = RemoveDuplicatesFromSortedListII.ListNode(3).apply {
                        next = RemoveDuplicatesFromSortedListII.ListNode(4).apply {
                            next = RemoveDuplicatesFromSortedListII.ListNode(4).apply {
                                next = RemoveDuplicatesFromSortedListII.ListNode(5)
                            }
                        }
                    }
                }
            }
        }) == RemoveDuplicatesFromSortedListII.ListNode(1).apply {
            next = RemoveDuplicatesFromSortedListII.ListNode(2).apply {
                next = RemoveDuplicatesFromSortedListII.ListNode(5)
            }
        })

        // Expected: 2 -> 3
        assert(r.deleteDuplicates(RemoveDuplicatesFromSortedListII.ListNode(1).apply {
            next = RemoveDuplicatesFromSortedListII.ListNode(1).apply {
                next = RemoveDuplicatesFromSortedListII.ListNode(2).apply {
                    next = RemoveDuplicatesFromSortedListII.ListNode(3)
                }
            }
        }) == RemoveDuplicatesFromSortedListII.ListNode(2).apply {
            next = RemoveDuplicatesFromSortedListII.ListNode(3)
        })

        // Expected: null
        assertNull(r.deleteDuplicates(RemoveDuplicatesFromSortedListII.ListNode(1).apply {
            next = RemoveDuplicatesFromSortedListII.ListNode(1).apply {
                next = RemoveDuplicatesFromSortedListII.ListNode(1)
            }
        }))

        // Expected: null
        assertNull(r.deleteDuplicates(null))

        // Expected: 1
        assert(r.deleteDuplicates(RemoveDuplicatesFromSortedListII.ListNode(1).apply {
            next = RemoveDuplicatesFromSortedListII.ListNode(2).apply {
                next = RemoveDuplicatesFromSortedListII.ListNode(2)
            }
        }) == RemoveDuplicatesFromSortedListII.ListNode(1))

        // Expected: null
        assertNull(r.deleteDuplicates(RemoveDuplicatesFromSortedListII.ListNode(1).apply {
            next = RemoveDuplicatesFromSortedListII.ListNode(1)
        }))

        // Expected: null
        assertNull(r.deleteDuplicates(RemoveDuplicatesFromSortedListII.ListNode(1).apply {
            next = RemoveDuplicatesFromSortedListII.ListNode(1).apply {
                next = RemoveDuplicatesFromSortedListII.ListNode(2).apply {
                    next = RemoveDuplicatesFromSortedListII.ListNode(2)
                }
            }
        }))
    }

}