import org.junit.Assert;
import org.junit.Test;

public class MergeTwoSortedListsTest {

    @Test
    public void testMergeTwoLists() {
        MergeTwoSortedLists m = new MergeTwoSortedLists();

        MergeTwoSortedLists.ListNode node1 = new MergeTwoSortedLists.ListNode(1);
        node1.next = new MergeTwoSortedLists.ListNode(2);
        node1.next.next = new MergeTwoSortedLists.ListNode(4);

        MergeTwoSortedLists.ListNode node2 = new MergeTwoSortedLists.ListNode(1);
        node2.next = new MergeTwoSortedLists.ListNode(3);
        node2.next.next = new MergeTwoSortedLists.ListNode(4);

        MergeTwoSortedLists.ListNode tmp = new MergeTwoSortedLists.ListNode(1);
        tmp.next = new MergeTwoSortedLists.ListNode(1);
        tmp.next.next = new MergeTwoSortedLists.ListNode(2);
        tmp.next.next.next = new MergeTwoSortedLists.ListNode(3);
        tmp.next.next.next.next = new MergeTwoSortedLists.ListNode(4);
        tmp.next.next.next.next.next = new MergeTwoSortedLists.ListNode(4);
        Assert.assertEquals(m.mergeTwoLists(node1, node2), tmp);

        tmp = new MergeTwoSortedLists.ListNode(1);
        tmp.next = new MergeTwoSortedLists.ListNode(2);
        tmp.next.next = new MergeTwoSortedLists.ListNode(4);
        Assert.assertEquals(m.mergeTwoLists(node1, null), tmp);

        tmp = new MergeTwoSortedLists.ListNode(1);
        tmp.next = new MergeTwoSortedLists.ListNode(3);
        tmp.next.next = new MergeTwoSortedLists.ListNode(4);
        Assert.assertEquals(m.mergeTwoLists(null, node2), tmp);

        Assert.assertNull(m.mergeTwoLists(null, null));
    }

}