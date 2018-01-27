import org.junit.Test
import kotlin.test.assertNull

class RemoveDuplicatesFromSortedListTest {

    @Test
    fun testDeleteDuplicates() {
        val r = RemoveDuplicatesFromSortedList()

        assertNull(r.deleteDuplicates(null))

        assert(r.deleteDuplicates(RemoveDuplicatesFromSortedList.ListNode(1).apply {
            next = RemoveDuplicatesFromSortedList.ListNode(1).apply {
                next = RemoveDuplicatesFromSortedList.ListNode(2)
            }
        }) == RemoveDuplicatesFromSortedList.ListNode(1).apply {
            next = RemoveDuplicatesFromSortedList.ListNode(2)
        })

        assert(r.deleteDuplicates(RemoveDuplicatesFromSortedList.ListNode(1).apply {
            next = RemoveDuplicatesFromSortedList.ListNode(1).apply {
                next = RemoveDuplicatesFromSortedList.ListNode(2).apply {
                    next = RemoveDuplicatesFromSortedList.ListNode(3).apply {
                        next = RemoveDuplicatesFromSortedList.ListNode(3)
                    }
                }
            }
        }) == RemoveDuplicatesFromSortedList.ListNode(1).apply {
            next = RemoveDuplicatesFromSortedList.ListNode(2).apply {
                next = RemoveDuplicatesFromSortedList.ListNode(3)
            }
        })

        assert(r.deleteDuplicates(RemoveDuplicatesFromSortedList.ListNode(1).apply {
            next = RemoveDuplicatesFromSortedList.ListNode(1).apply {
                next = RemoveDuplicatesFromSortedList.ListNode(1)
            }
        }) == RemoveDuplicatesFromSortedList.ListNode(1))

        assert(r.deleteDuplicates(RemoveDuplicatesFromSortedList.ListNode(1).apply {
            next = RemoveDuplicatesFromSortedList.ListNode(2).apply {
                next = RemoveDuplicatesFromSortedList.ListNode(2).apply {
                    next = RemoveDuplicatesFromSortedList.ListNode(2)
                }
            }
        }) == RemoveDuplicatesFromSortedList.ListNode(1).apply {
            next = RemoveDuplicatesFromSortedList.ListNode(2)
        })

        assert(r.deleteDuplicates(RemoveDuplicatesFromSortedList.ListNode(1).apply {
            next = RemoveDuplicatesFromSortedList.ListNode(1).apply {
                next = RemoveDuplicatesFromSortedList.ListNode(2).apply {
                    next = RemoveDuplicatesFromSortedList.ListNode(2)
                }
            }
        }) == RemoveDuplicatesFromSortedList.ListNode(1).apply {
            next = RemoveDuplicatesFromSortedList.ListNode(2)
        })
    }

}