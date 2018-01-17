/**
 * Implement strStr().
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Accepted.
 */
public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        if (haystack == null
                || needle == null
                || needle.length() > haystack.length()) {
            return -1;
        }
        if (haystack.isEmpty() || needle.isEmpty()) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        ImplementStrStr iss = new ImplementStrStr();
        // Expected: 3
        System.out.println(iss.strStr("aaab", "b"));
        // Expected: 0
        System.out.println(iss.strStr("", ""));
        // Expected: -1
        System.out.println(iss.strStr("", "a"));
        // Expected: 4
        System.out.println(iss.strStr("whats up", "s "));
    }

}
