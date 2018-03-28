import org.junit.Assert;
import org.junit.Test;

public class IntersectionOfTwoLinkedListsTest {

    @Test
    public void testGetIntersectionNode() {
        IntersectionOfTwoLinkedLists i = new IntersectionOfTwoLinkedLists();

        Assert.assertNull(i.getIntersectionNode(null, null));

        IntersectionOfTwoLinkedLists.ListNode node345 = new IntersectionOfTwoLinkedLists.ListNode(3);
        node345.next = new IntersectionOfTwoLinkedLists.ListNode(4);
        node345.next.next = new IntersectionOfTwoLinkedLists.ListNode(5);

        Assert.assertNull(i.getIntersectionNode(node345, new IntersectionOfTwoLinkedLists.ListNode(6)));

        IntersectionOfTwoLinkedLists.ListNode node12345 = new IntersectionOfTwoLinkedLists.ListNode(1);
        node12345.next = new IntersectionOfTwoLinkedLists.ListNode(2);
        node12345.next.next = node345;

        Assert.assertEquals(i.getIntersectionNode(node12345, node345), node345);
    }

}