import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class RestoreIPAddressesTest {

    @Test
    public void testRestoreIpAddresses() {
        RestoreIPAddresses r = new RestoreIPAddresses();

        Assert.assertTrue(r.restoreIpAddresses("1").isEmpty());

        Assert.assertTrue(r.restoreIpAddresses("111").isEmpty());

        Assert.assertTrue(r.restoreIpAddresses("1111111111111").isEmpty());

        Assert.assertEquals(r.restoreIpAddresses("1111"), Collections.singletonList("1.1.1.1"));

        Assert.assertEquals(r.restoreIpAddresses("25525511135"), Arrays.asList("255.255.11.135", "255.255.111.35"));
    }

}