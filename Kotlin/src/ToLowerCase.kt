/**
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 *
 * Example 1:
 *
 * Input: "Hello"
 * Output: "hello"
 * Example 2:
 *
 * Input: "here"
 * Output: "here"
 * Example 3:
 *
 * Input: "LOVELY"
 * Output: "lovely"
 *
 * Accepted.
 */

class ToLowerCase {

    fun toLowerCase(str: String): String {
//         return str.toLowerCase()
        val sb = StringBuilder()
        for (ch in str.toCharArray()) {
            if (ch.toInt() in 65..90) {
                sb.append((ch.toInt() + 32).toChar())
            } else {
                sb.append(ch)
            }
        }

        return sb.toString()
    }

}
