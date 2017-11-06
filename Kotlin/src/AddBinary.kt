/**
 * Given two binary strings, return their sum (also a binary string).
 *
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 */
class AddBinary {

    fun addBinary(a: String?, b: String?): String {
        if (a == null || b == null) return ""
        if (a.isEmpty()) return b
        if (b.isEmpty()) return a

        var flag = false // if it needs to plus one

        val longer = if (a.length >= b.length) a else b
        val shorter = if (a.length < b.length) a else b

        val sb = StringBuilder(longer.length + 1)

        var i = longer.length - 1
        var j = shorter.length - 1
        while (i >= 0) {
            if (j < 0) {
                if (longer[i] == '1') {
                    if (flag)
                        sb.append('0')
                    else
                        sb.append('1')
                } else { // l == '0'
                    if (flag) {
                        sb.append('1')
                        flag = false
                    } else
                        sb.append('0')
                }
            } else {
                if (longer[i] == '1' && shorter[j] == '1') {
                    if (flag)
                        sb.append('1')
                    else
                        sb.append('0')
                    flag = true
                } else if (longer[i] == '0' && shorter[j] == '0') {
                    if (flag)
                        sb.append('1')
                    else
                        sb.append('0')
                    flag = false
                } else { // (l == '1' && s == '0') || (l == '0' && s == '1')
                    if (flag) {
                        sb.append('0')
                        flag = true
                    } else
                        sb.append('1')
                }
            }
            i--
            j--

        }
        if (flag) sb.append('1')

        return sb.reverse().toString()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val ab = AddBinary()

            // Expected: 0
            println(ab.addBinary("0", "0"))
            // Expected: 100
            println(ab.addBinary("11", "1"))
            // Expected: 1010
            println(ab.addBinary("101", "101"))
        }
    }

}