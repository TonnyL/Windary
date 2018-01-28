import org.junit.Assert;
import org.junit.Test;

public class SwapNodesInPairsTest {

    @Test
    public void testSwapPairs() {
        SwapNodesInPairs s = new SwapNodesInPairs();

        Assert.assertNull(s.swapPairs(null));

        Assert.assertEquals(s.swapPairs(new SwapNodesInPairs.ListNode(1)), new SwapNodesInPairs.ListNode(1));

        SwapNodesInPairs.ListNode node12 = new SwapNodesInPairs.ListNode(1);
        node12.next = new SwapNodesInPairs.ListNode(2);
        SwapNodesInPairs.ListNode tmp = new SwapNodesInPairs.ListNode(2);
        tmp.next = new SwapNodesInPairs.ListNode(1);
        Assert.assertEquals(s.swapPairs(node12), tmp);

        SwapNodesInPairs.ListNode node1234 = new SwapNodesInPairs.ListNode(1);
        node1234.next = new SwapNodesInPairs.ListNode(2);
        node1234.next.next = new SwapNodesInPairs.ListNode(3);
        node1234.next.next.next = new SwapNodesInPairs.ListNode(4);
        tmp.next.next = new SwapNodesInPairs.ListNode(4);
        tmp.next.next.next = new SwapNodesInPairs.ListNode(3);
        Assert.assertEquals(s.swapPairs(node1234), tmp);

        SwapNodesInPairs.ListNode node12345 = new SwapNodesInPairs.ListNode(1);
        node12345.next = new SwapNodesInPairs.ListNode(2);
        node12345.next.next = new SwapNodesInPairs.ListNode(3);
        node12345.next.next.next = new SwapNodesInPairs.ListNode(4);
        node12345.next.next.next.next = new SwapNodesInPairs.ListNode(5);
        tmp.next.next.next.next = new SwapNodesInPairs.ListNode(5);
        Assert.assertEquals(s.swapPairs(node12345), tmp);
    }

}