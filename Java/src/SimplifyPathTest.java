import org.junit.Assert;
import org.junit.Test;

public class SimplifyPathTest {

    @Test
    public void testSimplifyPath() {
        SimplifyPath sp = new SimplifyPath();

        Assert.assertEquals(sp.simplifyPath("/home/"), "/home");

        Assert.assertEquals(sp.simplifyPath("/a/./b/../../c/"), "/c");

        Assert.assertEquals(sp.simplifyPath("/../"), "/");

        Assert.assertEquals(sp.simplifyPath("/home//foo/"), "/home/foo");

        Assert.assertEquals(sp.simplifyPath("/a/b/c"), "/a/b/c");
    }
    
}