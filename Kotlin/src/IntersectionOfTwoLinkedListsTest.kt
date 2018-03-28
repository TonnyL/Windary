import org.junit.Assert
import org.junit.Test

class IntersectionOfTwoLinkedListsTest {

    @Test
    fun testGetIntersectionNode() {
        val i = IntersectionOfTwoLinkedLists()

        Assert.assertNull(i.getIntersectionNode(null, null))

        val node345 = IntersectionOfTwoLinkedLists.ListNode(3).apply {
            next = IntersectionOfTwoLinkedLists.ListNode(4).apply {
                next = IntersectionOfTwoLinkedLists.ListNode(5)
            }
        }

        Assert.assertNull(i.getIntersectionNode(node345, IntersectionOfTwoLinkedLists.ListNode(6)))

        val node12345 = IntersectionOfTwoLinkedLists.ListNode(1).apply {
            next = IntersectionOfTwoLinkedLists.ListNode(2).apply {
                next = node345
            }
        }

        Assert.assertEquals(i.getIntersectionNode(node12345, node345), node345)
    }

}