import org.junit.Assert;
import org.junit.Test;

public class InsertionSortListTest {

    @Test
    public void testInsertionSortList() {
        InsertionSortList i = new InsertionSortList();

        Assert.assertNull(i.insertionSortList(null));

        Assert.assertEquals(i.insertionSortList(new InsertionSortList.ListNode(1)), new InsertionSortList.ListNode(1));

        InsertionSortList.ListNode node0 = new InsertionSortList.ListNode(1);
        node0.next = new InsertionSortList.ListNode(0);
        InsertionSortList.ListNode node1 = new InsertionSortList.ListNode(0);
        node1.next = new InsertionSortList.ListNode(1);
        Assert.assertEquals(i.insertionSortList(node0), node1);

    }

}