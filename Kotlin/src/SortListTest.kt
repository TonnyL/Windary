import org.junit.Assert
import org.junit.Test

class SortListTest {

    @Test
    fun sortList() {
        val sl = SortList()

        Assert.assertNull(sl.sortList(null))

        Assert.assertEquals(SortList.ListNode(0), sl.sortList(SortList.ListNode(0)))

        val node1 = SortList.ListNode(1).apply {
            next = SortList.ListNode(0)
        }

        val node2 = SortList.ListNode(0).apply {
            next = SortList.ListNode(1)
        }

        Assert.assertEquals(node2, sl.sortList(node1))

        val node3 = SortList.ListNode(0).apply {
            next = SortList.ListNode(1)
        }
        Assert.assertEquals(node3, sl.sortList(node2))
    }

}