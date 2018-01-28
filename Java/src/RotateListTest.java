import org.junit.Assert;
import org.junit.Test;

public class RotateListTest {

    @Test
    public void testRotateRight() {
        RotateList rl = new RotateList();

        Assert.assertNull(rl.rotateRight(null, 1));

        RotateList.ListNode tmp = new RotateList.ListNode(1);
        Assert.assertEquals(rl.rotateRight(new RotateList.ListNode(1), 1), tmp);

        RotateList.ListNode node12 = new RotateList.ListNode(1);
        node12.next = new RotateList.ListNode(2);
        tmp.next = new RotateList.ListNode(2);
        Assert.assertEquals(rl.rotateRight(node12, 0), tmp);

        RotateList.ListNode node123 = new RotateList.ListNode(1);
        node123.next = new RotateList.ListNode(2);
        node123.next.next = new RotateList.ListNode(3);
        tmp = new RotateList.ListNode(3);
        tmp.next = new RotateList.ListNode(1);
        tmp.next.next = new RotateList.ListNode(2);
        Assert.assertEquals(rl.rotateRight(node123, 1), tmp);

        RotateList.ListNode node12345 = new RotateList.ListNode(1);
        node12345.next = new RotateList.ListNode(2);
        node12345.next.next = new RotateList.ListNode(3);
        node12345.next.next.next = new RotateList.ListNode(4);
        node12345.next.next.next.next = new RotateList.ListNode(5);
        tmp = new RotateList.ListNode(4);
        tmp.next = new RotateList.ListNode(5);
        tmp.next.next = new RotateList.ListNode(1);
        tmp.next.next.next = new RotateList.ListNode(2);
        tmp.next.next.next.next = new RotateList.ListNode(3);
        Assert.assertEquals(rl.rotateRight(node12345, 2), tmp);
    }

}