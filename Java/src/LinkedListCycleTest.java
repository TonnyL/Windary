import org.junit.Assert;
import org.junit.Test;

public class LinkedListCycleTest {

    @Test
    public void testHasCycle() {
        LinkedListCycle l = new LinkedListCycle();

        Assert.assertFalse(l.hasCycle(null));

        Assert.assertFalse(l.hasCycle(new LinkedListCycle.ListNode(0)));

        LinkedListCycle.ListNode node0 = new LinkedListCycle.ListNode(0);
        node0.next = new LinkedListCycle.ListNode(1);
        node0.next.next = node0;
        Assert.assertTrue(l.hasCycle(node0));

        LinkedListCycle.ListNode node1 = new LinkedListCycle.ListNode(0);
        node1.next = new LinkedListCycle.ListNode(1);
        node1.next.next = new LinkedListCycle.ListNode(2);
        node1.next.next.next = new LinkedListCycle.ListNode(0);
        Assert.assertFalse(l.hasCycle(node1));
    }

}