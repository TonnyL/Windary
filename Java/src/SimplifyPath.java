import java.util.Stack;

/**
 * Given an absolute path for a file (Unix-style), simplify it.
 * <p>
 * For example,
 * path = "/home/", => "/home"
 * path = "/a/./b/../../c/", => "/c"
 * <p>
 * Corner Cases:
 * Did you consider the case where path = "/../"?
 * In this case, you should return "/".
 * Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
 * In this case, you should ignore redundant slashes and return "/home/foo".
 * <p>
 * Accepted.
 */
public class SimplifyPath {

    public String simplifyPath(String path) {
        if (path == null || path.isEmpty()) {
            return path;
        }

        String[] strings = path.split("/");
        Stack<String> stack = new Stack<>();
        for (int i = 1; i < strings.length; i++) {
            if (strings[i].equals("..")) {
                if (!stack.empty()) {
                    stack.pop();
                }
            } else if (!strings[i].equals(".") && !strings[i].isEmpty()) {
                stack.push(strings[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        stack.forEach(s ->
                sb.append("/").append(s)
        );

        return sb.length() == 0 ? "/" : sb.toString();
    }

    public static void main(String[] args) {
        SimplifyPath sp = new SimplifyPath();

        // Expected: "/home"
        System.out.println(sp.simplifyPath("/home/"));

        // Expected: "/c"
        System.out.println(sp.simplifyPath("/a/./b/../../c/"));

        // Expected: "/"
        System.out.println(sp.simplifyPath("/../"));

        // Expected: "/home/foo"
        System.out.println(sp.simplifyPath("/home//foo/"));

        // Expected: "/a/b/c"
        System.out.println(sp.simplifyPath("/a/b/c"));
    }

}
