import org.junit.Assert;
import org.junit.Test;

public class PartitionListTest {

    @Test
    public void testPartition() {
        PartitionList pl = new PartitionList();

        Assert.assertNull(pl.partition(null, 2));

        PartitionList.ListNode node12 = new PartitionList.ListNode(1);
        node12.next = new PartitionList.ListNode(2);
        PartitionList.ListNode tmp = new PartitionList.ListNode(1);
        tmp.next = new PartitionList.ListNode(2);
        Assert.assertEquals(pl.partition(node12, 3), tmp);

        Assert.assertEquals(pl.partition(node12, 0), tmp);

        PartitionList.ListNode node143252 = new PartitionList.ListNode(1);
        node143252.next = new PartitionList.ListNode(4);
        node143252.next.next = new PartitionList.ListNode(3);
        node143252.next.next.next = new PartitionList.ListNode(2);
        node143252.next.next.next.next = new PartitionList.ListNode(5);
        node143252.next.next.next.next.next = new PartitionList.ListNode(2);
        tmp = new PartitionList.ListNode(1);
        tmp.next = new PartitionList.ListNode(2);
        tmp.next.next = new PartitionList.ListNode(2);
        tmp.next.next.next = new PartitionList.ListNode(4);
        tmp.next.next.next.next = new PartitionList.ListNode(3);
        tmp.next.next.next.next.next = new PartitionList.ListNode(5);
        Assert.assertEquals(pl.partition(node143252, 3), tmp);

        tmp = new PartitionList.ListNode(1);
        tmp.next = new PartitionList.ListNode(3);
        tmp.next.next = new PartitionList.ListNode(2);
        tmp.next.next.next = new PartitionList.ListNode(2);
        tmp.next.next.next.next = new PartitionList.ListNode(4);
        tmp.next.next.next.next.next = new PartitionList.ListNode(5);
        Assert.assertEquals(pl.partition(node143252, 4), tmp);
    }

}