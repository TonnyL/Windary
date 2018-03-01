import org.junit.Assert
import org.junit.Test

class InsertionSortListTest {

    @Test
    fun testInsertionSortList() {
        val i = InsertionSortList()

        Assert.assertNull(i.insertionSortList(null))

        Assert.assertEquals(i.insertionSortList(InsertionSortList.ListNode(1)), InsertionSortList.ListNode(1))

        Assert.assertEquals(i.insertionSortList(InsertionSortList.ListNode(1).apply {
            next = InsertionSortList.ListNode(0)
        }), InsertionSortList.ListNode(0).apply {
            next = InsertionSortList.ListNode(1)
        })

    }

}