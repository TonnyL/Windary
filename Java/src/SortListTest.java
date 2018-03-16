import org.junit.Assert;
import org.junit.Test;

public class SortListTest {

    @Test
    public void sortList() {
        SortList sl = new SortList();

        Assert.assertNull(sl.sortList(null));

        Assert.assertEquals(new SortList.ListNode(0), sl.sortList(new SortList.ListNode(0)));

        SortList.ListNode node1 = new SortList.ListNode(1);
        node1.next = new SortList.ListNode(0);

        SortList.ListNode node2 = new SortList.ListNode(0);
        node2.next = new SortList.ListNode(1);

        Assert.assertEquals(node2, sl.sortList(node1));

        SortList.ListNode node3 = new SortList.ListNode(0);
        node3.next = new SortList.ListNode(1);
        Assert.assertEquals(node3, sl.sortList(node2));
    }

}