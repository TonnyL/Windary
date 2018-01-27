/**
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 *
 * For example,
 * If n = 4 and k = 2, a solution is:
 *
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 */
class Combinations {

    // Iterative solution.
    // Accepted.
    fun combine(n: Int, k: Int): List<List<Int>> {
        var results = mutableListOf<List<Int>>()
        if (n == 0 || k == 0 || k > n) {
            return results
        }

        (1..n + 1 - k).mapTo(results) {
            listOf(it)
        }

        for (i in 2..k) {
            val tmp = mutableListOf<List<Int>>()
            for (list in results) {
                for (m in list[list.size - 1] + 1..n - (k - i)) {
                    val newList = mutableListOf<Int>()
                    newList.addAll(list)
                    newList.add(m)
                    tmp.add(newList)
                }
            }
            results = tmp
        }
        return results
    }

    // Recursive solution.
    // Accepted.
    /*fun combine(n: Int, k: Int): List<List<Int>> {
        val results = mutableListOf<List<Int>>()
        if (n == 0 || k == 0 || k > n) {
            return results
        }

        if (k == 1) {
            (1..n).mapTo(results) {
                listOf(it)
            }
            return results
        }

        for (list in combine(n, k - 1)) {
            for (i in list[list.size - 1] until n) {
                val tmp = mutableListOf<Int>()
                tmp.addAll(list)
                tmp.add(i + 1)
                results.add(tmp)
            }
        }

        return results*/

}
