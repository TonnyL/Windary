import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbers() {
        AddTwoNumbers atn = new AddTwoNumbers();

        AddTwoNumbers.ListNode node0 = new AddTwoNumbers.ListNode(0);
        AddTwoNumbers.ListNode node5 = new AddTwoNumbers.ListNode(5);
        Assert.assertEquals(atn.addTwoNumbers(node0, node0), new AddTwoNumbers.ListNode(0));

        AddTwoNumbers.ListNode tmp = new AddTwoNumbers.ListNode(0);
        tmp.next = new AddTwoNumbers.ListNode(1);

        Assert.assertEquals(atn.addTwoNumbers(node5, node5), tmp);

        AddTwoNumbers.ListNode node243 = new AddTwoNumbers.ListNode(2);
        node243.next = new AddTwoNumbers.ListNode(4);
        node243.next.next = new AddTwoNumbers.ListNode(3);

        AddTwoNumbers.ListNode node564 = new AddTwoNumbers.ListNode(5);
        node564.next = new AddTwoNumbers.ListNode(6);
        node564.next.next = new AddTwoNumbers.ListNode(4);

        tmp = new AddTwoNumbers.ListNode(7);
        tmp.next = new AddTwoNumbers.ListNode(0);
        tmp.next.next = new AddTwoNumbers.ListNode(8);
        Assert.assertEquals(atn.addTwoNumbers(node243, node564), tmp);

        AddTwoNumbers.ListNode node1 = new AddTwoNumbers.ListNode(1);
        AddTwoNumbers.ListNode node99 = new AddTwoNumbers.ListNode(9);
        node99.next = new AddTwoNumbers.ListNode(9);

        tmp = new AddTwoNumbers.ListNode(0);
        tmp.next = new AddTwoNumbers.ListNode(0);
        tmp.next.next = new AddTwoNumbers.ListNode(1);
        Assert.assertEquals(atn.addTwoNumbers(node1, node99), tmp);
    }

}