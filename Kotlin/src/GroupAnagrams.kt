/**
 * Given an array of strings, group anagrams together.
 *
 * For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Return:
 *
 * [
 * ["ate", "eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 * Note: All inputs will be in lower-case.
 *
 * Accepted.
 */
class GroupAnagrams {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val results = mutableListOf<MutableList<String>>()

        if (strs.isEmpty()) return results

        val map = mutableMapOf<String, MutableList<String>>()
        strs.forEach {
            val chars = it.toCharArray()
            chars.sort()
            val key = String(chars)
            map.getOrPut(key, { mutableListOf() })
            map[key]?.add(it)
        }

        return results.apply { addAll(map.values) }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val ga = GroupAnagrams()

            // Expected:
            // [
            //  []
            // ]
            println("[${ga.groupAnagrams(arrayOf())
                    .joinToString { "[${it.joinToString { it }}]" }}]")

            // Expected:
            // [
            //  ["ate", "eat","tea"],
            //  ["nat","tan"],
            //  ["bat"]
            // ]
            println("[${ga.groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))
                    .joinToString { "[${it.joinToString { it }}]" }}]")
        }
    }

}