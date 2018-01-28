import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedListIITest {

    @Test
    public void testDeleteDuplicates() {
        RemoveDuplicatesFromSortedListII r = new RemoveDuplicatesFromSortedListII();

        RemoveDuplicatesFromSortedListII.ListNode node1233445 = new RemoveDuplicatesFromSortedListII.ListNode(1);
        node1233445.next = new RemoveDuplicatesFromSortedListII.ListNode(2);
        node1233445.next.next = new RemoveDuplicatesFromSortedListII.ListNode(3);
        node1233445.next.next.next = new RemoveDuplicatesFromSortedListII.ListNode(3);
        node1233445.next.next.next.next = new RemoveDuplicatesFromSortedListII.ListNode(4);
        node1233445.next.next.next.next.next = new RemoveDuplicatesFromSortedListII.ListNode(4);
        node1233445.next.next.next.next.next.next = new RemoveDuplicatesFromSortedListII.ListNode(5);
        RemoveDuplicatesFromSortedListII.ListNode tmp = new RemoveDuplicatesFromSortedListII.ListNode(1);
        tmp.next = new RemoveDuplicatesFromSortedListII.ListNode(2);
        tmp.next.next = new RemoveDuplicatesFromSortedListII.ListNode(5);
        Assert.assertEquals(r.deleteDuplicates(node1233445), tmp);

        RemoveDuplicatesFromSortedListII.ListNode node11123 = new RemoveDuplicatesFromSortedListII.ListNode(1);
        node11123.next = new RemoveDuplicatesFromSortedListII.ListNode(1);
        node11123.next.next = new RemoveDuplicatesFromSortedListII.ListNode(1);
        node11123.next.next.next = new RemoveDuplicatesFromSortedListII.ListNode(2);
        node11123.next.next.next.next = new RemoveDuplicatesFromSortedListII.ListNode(3);
        tmp = new RemoveDuplicatesFromSortedListII.ListNode(2);
        tmp.next = new RemoveDuplicatesFromSortedListII.ListNode(3);
        Assert.assertEquals(r.deleteDuplicates(node11123), tmp);

        RemoveDuplicatesFromSortedListII.ListNode node111 = new RemoveDuplicatesFromSortedListII.ListNode(1);
        node111.next = new RemoveDuplicatesFromSortedListII.ListNode(1);
        node111.next.next = new RemoveDuplicatesFromSortedListII.ListNode(1);
        Assert.assertNull(r.deleteDuplicates(node111));

        Assert.assertNull(r.deleteDuplicates(null));

        RemoveDuplicatesFromSortedListII.ListNode node122 = new RemoveDuplicatesFromSortedListII.ListNode(1);
        node122.next = new RemoveDuplicatesFromSortedListII.ListNode(2);
        node122.next.next = new RemoveDuplicatesFromSortedListII.ListNode(2);
        tmp = new RemoveDuplicatesFromSortedListII.ListNode(1);
        Assert.assertEquals(r.deleteDuplicates(node122), tmp);

        RemoveDuplicatesFromSortedListII.ListNode node11 = new RemoveDuplicatesFromSortedListII.ListNode(1);
        node11.next = new RemoveDuplicatesFromSortedListII.ListNode(1);
        Assert.assertNull(r.deleteDuplicates(node11));

        RemoveDuplicatesFromSortedListII.ListNode node1122 = new RemoveDuplicatesFromSortedListII.ListNode(1);
        node1122.next = new RemoveDuplicatesFromSortedListII.ListNode(1);
        node1122.next.next = new RemoveDuplicatesFromSortedListII.ListNode(2);
        node1122.next.next.next = new RemoveDuplicatesFromSortedListII.ListNode(2);
        Assert.assertNull(r.deleteDuplicates(node1122));
    }

}