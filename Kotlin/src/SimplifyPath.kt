import java.util.Stack

/**
 * Given an absolute path for a file (Unix-style), simplify it.
 *
 * For example,
 * path = "/home/", => "/home"
 * path = "/a/./b/../../c/", => "/c"
 *
 * Corner Cases:
 * Did you consider the case where path = "/../"?
 * In this case, you should return "/".
 * Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
 * In this case, you should ignore redundant slashes and return "/home/foo".
 *
 * Accepted.
 */
class SimplifyPath {

    fun simplifyPath(path: String): String {
        if (path.isEmpty()) return path

        val strings = path.split("/".toRegex()).toTypedArray()
        val stack = Stack<String>()
        (1 until strings.size).forEach {
            if (strings[it] == "..") {
                if (!stack.empty())
                    stack.pop()
            } else if (strings[it] != "." && !strings[it].isEmpty())
                stack.push(strings[it])
        }

        val sb = StringBuilder()
        stack.forEach { sb.append("/").append(it) }

        return if (sb.isEmpty()) "/" else sb.toString()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val sp = SimplifyPath()

            // Expected: "/home"
            println(sp.simplifyPath("/home/"))

            // Expected: "/c"
            println(sp.simplifyPath("/a/./b/../../c/"))

            // Expected: "/"
            println(sp.simplifyPath("/../"))

            // Expected: "/home/foo"
            println(sp.simplifyPath("/home//foo/"))

            // Expected: "/a/b/c"
            println(sp.simplifyPath("/a/b/c"))
        }
    }

}
