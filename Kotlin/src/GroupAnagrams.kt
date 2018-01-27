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

        if (strs.isEmpty()) {
            return emptyList()
        }

        val map = mutableMapOf<String, MutableList<String>>()
        strs.forEach {
            val chars = it.toCharArray()
            chars.sort()
            val key = String(chars)
            map.getOrPut(key, { mutableListOf() })
            map[key]?.add(it)
        }

        return results.apply {
            addAll(map.values)
        }
    }

}