import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedListTest {

    @Test
    public void testDeleteDuplicates() {
        RemoveDuplicatesFromSortedList r = new RemoveDuplicatesFromSortedList();

        Assert.assertNull(r.deleteDuplicates(null));

        RemoveDuplicatesFromSortedList.ListNode node112 = new RemoveDuplicatesFromSortedList.ListNode(1);
        node112.next = new RemoveDuplicatesFromSortedList.ListNode(1);
        node112.next.next = new RemoveDuplicatesFromSortedList.ListNode(2);
        RemoveDuplicatesFromSortedList.ListNode tmp = new RemoveDuplicatesFromSortedList.ListNode(1);
        tmp.next = new RemoveDuplicatesFromSortedList.ListNode(2);
        Assert.assertEquals(r.deleteDuplicates(node112), tmp);

        RemoveDuplicatesFromSortedList.ListNode node11233 = new RemoveDuplicatesFromSortedList.ListNode(1);
        node11233.next = new RemoveDuplicatesFromSortedList.ListNode(1);
        node11233.next.next = new RemoveDuplicatesFromSortedList.ListNode(2);
        node11233.next.next.next = new RemoveDuplicatesFromSortedList.ListNode(3);
        node11233.next.next.next.next = new RemoveDuplicatesFromSortedList.ListNode(3);
        tmp = new RemoveDuplicatesFromSortedList.ListNode(1);
        tmp.next = new RemoveDuplicatesFromSortedList.ListNode(2);
        tmp.next.next = new RemoveDuplicatesFromSortedList.ListNode(3);
        Assert.assertEquals(r.deleteDuplicates(node11233), tmp);

        RemoveDuplicatesFromSortedList.ListNode node111 = new RemoveDuplicatesFromSortedList.ListNode(1);
        node111.next = new RemoveDuplicatesFromSortedList.ListNode(1);
        node111.next.next = new RemoveDuplicatesFromSortedList.ListNode(1);
        tmp = new RemoveDuplicatesFromSortedList.ListNode(1);
        Assert.assertEquals(r.deleteDuplicates(node111), tmp);

        RemoveDuplicatesFromSortedList.ListNode node1222 = new RemoveDuplicatesFromSortedList.ListNode(1);
        node1222.next = new RemoveDuplicatesFromSortedList.ListNode(2);
        node1222.next.next = new RemoveDuplicatesFromSortedList.ListNode(2);
        node1222.next.next.next = new RemoveDuplicatesFromSortedList.ListNode(2);
        tmp.next = new RemoveDuplicatesFromSortedList.ListNode(2);
        Assert.assertEquals(r.deleteDuplicates(node1222), tmp);

        RemoveDuplicatesFromSortedList.ListNode node1122 = new RemoveDuplicatesFromSortedList.ListNode(1);
        node1122.next = new RemoveDuplicatesFromSortedList.ListNode(1);
        node1122.next = new RemoveDuplicatesFromSortedList.ListNode(2);
        node1122.next.next = new RemoveDuplicatesFromSortedList.ListNode(2);
        Assert.assertEquals(r.deleteDuplicates(node1122), tmp);
    }

}