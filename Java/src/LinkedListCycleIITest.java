import org.junit.Assert;
import org.junit.Test;

public class LinkedListCycleIITest {

    @Test
    public void testDetectCycle() {
        LinkedListCycleII l = new LinkedListCycleII();

        Assert.assertNull(l.detectCycle(null));

        Assert.assertNull(l.detectCycle(new LinkedListCycleII.ListNode(0)));
    }

}