import org.junit.Assert;
import org.junit.Test;

public class RemoveNthNodeFromEndOfListTest {

    @Test
    public void testRemoveNthFromEnd() {
        RemoveNthNodeFromEndOfList r = new RemoveNthNodeFromEndOfList();

        RemoveNthNodeFromEndOfList.ListNode node12345 = new RemoveNthNodeFromEndOfList.ListNode(1);
        node12345.next = new RemoveNthNodeFromEndOfList.ListNode(2);
        node12345.next.next = new RemoveNthNodeFromEndOfList.ListNode(3);
        node12345.next.next.next = new RemoveNthNodeFromEndOfList.ListNode(4);
        node12345.next.next.next.next = new RemoveNthNodeFromEndOfList.ListNode(5);
        RemoveNthNodeFromEndOfList.ListNode tmp = new RemoveNthNodeFromEndOfList.ListNode(1);
        tmp.next = new RemoveNthNodeFromEndOfList.ListNode(2);
        tmp.next.next = new RemoveNthNodeFromEndOfList.ListNode(3);
        tmp.next.next.next = new RemoveNthNodeFromEndOfList.ListNode(5);
        Assert.assertEquals(r.removeNthFromEnd(node12345, 2), tmp);

        RemoveNthNodeFromEndOfList.ListNode node12 = new RemoveNthNodeFromEndOfList.ListNode(1);
        node12.next = new RemoveNthNodeFromEndOfList.ListNode(2);
        tmp = new RemoveNthNodeFromEndOfList.ListNode(1);
        Assert.assertEquals(r.removeNthFromEnd(node12, 1), tmp);

        Assert.assertNull(r.removeNthFromEnd(new RemoveNthNodeFromEndOfList.ListNode(1), 1));

        Assert.assertNull(r.removeNthFromEnd(null, 2));

        RemoveNthNodeFromEndOfList.ListNode node123 = new RemoveNthNodeFromEndOfList.ListNode(1);
        node123.next = new RemoveNthNodeFromEndOfList.ListNode(2);
        node123.next.next = new RemoveNthNodeFromEndOfList.ListNode(3);
        tmp = new RemoveNthNodeFromEndOfList.ListNode(2);
        tmp.next = new RemoveNthNodeFromEndOfList.ListNode(3);
        node123 = r.removeNthFromEnd(node123, 3);
        Assert.assertEquals(node123, tmp);
        tmp = new RemoveNthNodeFromEndOfList.ListNode(2);
        Assert.assertEquals(r.removeNthFromEnd(node123, 1), tmp);
        Assert.assertNull(r.removeNthFromEnd(node123, 1));
    }

}