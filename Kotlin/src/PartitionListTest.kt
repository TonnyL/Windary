import org.junit.Test
import kotlin.test.assertNull

class PartitionListTest {

    @Test
    fun testPartition() {
        val pl = PartitionList()

        assertNull(pl.partition(null, 2))

        val node12 = PartitionList.ListNode(1).apply {
            next = PartitionList.ListNode(2)
        }
        assert(pl.partition(node12, 3) == PartitionList.ListNode(1).apply {
            next = PartitionList.ListNode(2)
        })

        assert(pl.partition(node12, 0) == PartitionList.ListNode(1).apply {
            next = PartitionList.ListNode(2)
        })

        val node143252 = PartitionList.ListNode(1).apply {
            next = PartitionList.ListNode(4).apply {
                next = PartitionList.ListNode(3).apply {
                    next = PartitionList.ListNode(2).apply {
                        next = PartitionList.ListNode(5).apply {
                            next = PartitionList.ListNode(2)
                        }
                    }
                }
            }
        }
        assert(pl.partition(node143252, 3) == PartitionList.ListNode(1).apply {
            next = PartitionList.ListNode(2).apply {
                next = PartitionList.ListNode(2).apply {
                    next = PartitionList.ListNode(4).apply {
                        next = PartitionList.ListNode(3).apply {
                            next = PartitionList.ListNode(5)
                        }
                    }
                }
            }
        })

        // Expected: 1 -> 3 -> 2 -> 2 -> 4 -> 5
        assert(pl.partition(node143252, 4) == PartitionList.ListNode(1).apply {
            next = PartitionList.ListNode(3).apply {
                next = PartitionList.ListNode(2).apply {
                    next = PartitionList.ListNode(2).apply {
                        next = PartitionList.ListNode(4).apply {
                            next = PartitionList.ListNode(5)
                        }
                    }
                }
            }
        })
    }

}