import org.junit.Assert;
import org.junit.Test;

public class ReverseLinkedListIITest {

    @Test
    public void testReverseBetween() {
        ReverseLinkedListII r = new ReverseLinkedListII();

        Assert.assertNull(r.reverseBetween(null, 1, 2));

        ReverseLinkedListII.ListNode node123 = new ReverseLinkedListII.ListNode(1);
        node123.next = new ReverseLinkedListII.ListNode(2);
        node123.next.next = new ReverseLinkedListII.ListNode(3);
        ReverseLinkedListII.ListNode tmp = new ReverseLinkedListII.ListNode(1);
        tmp.next = new ReverseLinkedListII.ListNode(3);
        tmp.next.next = new ReverseLinkedListII.ListNode(2);
        Assert.assertEquals(r.reverseBetween(node123, 2, 3), tmp);

        Assert.assertEquals(r.reverseBetween(new ReverseLinkedListII.ListNode(1), 1, 1), new ReverseLinkedListII.ListNode(1));

        ReverseLinkedListII.ListNode node12 = new ReverseLinkedListII.ListNode(1);
        node12.next = new ReverseLinkedListII.ListNode(2);
        tmp = new ReverseLinkedListII.ListNode(2);
        tmp.next = new ReverseLinkedListII.ListNode(1);
        Assert.assertEquals(r.reverseBetween(node12, 1, 2), tmp);

        ReverseLinkedListII.ListNode node12345 = new ReverseLinkedListII.ListNode(1);
        node12345.next = new ReverseLinkedListII.ListNode(2);
        node12345.next.next = new ReverseLinkedListII.ListNode(3);
        node12345.next.next.next = new ReverseLinkedListII.ListNode(4);
        node12345.next.next.next.next = new ReverseLinkedListII.ListNode(5);
        tmp = new ReverseLinkedListII.ListNode(1);
        tmp.next = new ReverseLinkedListII.ListNode(4);
        tmp.next.next = new ReverseLinkedListII.ListNode(3);
        tmp.next.next.next = new ReverseLinkedListII.ListNode(2);
        tmp.next.next.next.next = new ReverseLinkedListII.ListNode(5);
        Assert.assertEquals(r.reverseBetween(node12345, 2, 4), tmp);
    }

}