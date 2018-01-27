import org.junit.Test

class SimplifyPathTest {

    @Test
    fun testSimplifyPath() {
        val sp = SimplifyPath()

        assert(sp.simplifyPath("/home/") == "/home")

        assert(sp.simplifyPath("/a/./b/../../c/") == "/c")

        assert(sp.simplifyPath("/../") == "/")

        assert(sp.simplifyPath("/home//foo/") == "/home/foo")

        assert(sp.simplifyPath("/a/b/c") == "/a/b/c")
    }

}