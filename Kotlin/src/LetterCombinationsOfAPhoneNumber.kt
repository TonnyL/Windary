/**
 * Given a digit string, return all possible letter combinations that the number could represent.
 *
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 *
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * Note:
 * Although the above answer is in lexicographical order, your answer could be in any order you want.
 *
 * Accepted.
 */
class LetterCombinationsOfAPhoneNumber {

    fun letterCombinations(digits: String): List<String> {
        val dict = arrayOf(" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz")
        val results = mutableListOf<String>()

        if (digits.isEmpty()) {
            return emptyList()
        }

        if (digits.length == 1) {
            dict[Integer.valueOf(digits)].toCharArray()
                    .mapTo(results) {
                        it.toString()
                    }
            return results
        }

        val list = letterCombinations(digits.substring(1, digits.length))
        val sb = StringBuilder()

        for (c in dict[Integer.valueOf(digits.substring(0, 1))].toCharArray()) {
            for (s in list) {
                sb.append(c.toString()).append(s)
                results.add(sb.toString())
                sb.setLength(0)
            }
        }

        return results
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val l = LetterCombinationsOfAPhoneNumber()

            // Expected: []
            println(l.letterCombinations(""))

            // Expected: [""]
            println(l.letterCombinations("1"))

            // Expected: ["a", "b", "c"]
            println(l.letterCombinations("2"))

            // Expected: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
            println(l.letterCombinations("23"))

            // Expected: ["adg", "adh", "adi", "aeg", "aeh", "aei",
            // "afg", "afh", "afi", "bdg", "bdh", "bdi", "beg", "beh",
            // "bei", "bfg", "bfh", "bfi", "cdg", "cdh", "cdi", "ceg",
            // "ceh", "cei", "cfg", "cfh", "cfi"]
            println(l.letterCombinations("234"))
        }
    }

}
