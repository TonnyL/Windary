/**
 * Given a string containing only digits, restore it by returning all possible valid IP address combinations.
 *
 * For example:
 * Given "25525511135",
 *
 * return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
 *
 * Accepted.
 */
class RestoreIPAddresses {

    fun restoreIpAddresses(s: String): List<String> {
        val results = mutableListOf<String>()
        if (s.length < 4 || s.length > 12) {
            return results
        }

        for (i in 1..3) {
            for (j in 1..3) {
                for (k in 1..3) {
                    for (m in 1..3) {
                        if (i + j + k + m == s.length) {
                            val a = s.substring(0, i).toInt()
                            val b = s.substring(i, j + i).toInt()
                            val c = s.substring(i + j, k + i + j).toInt()
                            val d = s.substring(i + j + k, m + i + j + k).toInt()
                            if (a <= 255 && b <= 255 && c <= 255 && d <= 255) {
                                val str = "$a.$b.$c.$d"
                                if (str.length == s.length + 3) {
                                    results.add(str)
                                }
                            }
                        }
                    }
                }
            }
        }

        return results
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val r = RestoreIPAddresses()

            // Expected: []
            println(r.restoreIpAddresses("1"))

            // Expected: []
            println(r.restoreIpAddresses("111"))

            // Expected: []
            println(r.restoreIpAddresses("1111111111111"))

            // Expected: ["1.1.1.1"]
            println(r.restoreIpAddresses("1111"))

            // Expected: ["255.255.11.135", "255.255.111.35"]
            println(r.restoreIpAddresses("25525511135"))
        }
    }

}
