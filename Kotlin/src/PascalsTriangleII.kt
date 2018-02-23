/**
 * Given an index k, return the kth row of the Pascal's triangle.
 *
 * For example, given k = 3,
 * Return [1,3,3,1].
 *
 * Note:
 * Could you optimize your algorithm to use only O(k) extra space?
 *
 * Accepted.
 */

class PascalsTriangleII {

    fun getRow(rowIndex: Int): List<Int> {
        val results = mutableListOf(1)

        if (rowIndex == 0) {
            return results
        }

        for (i in 0 until rowIndex) {
            results.add(1)
            for (j in results.size - 2 downTo 1) {
                results[j] = results[j - 1] + results[j]
            }
        }

        return results
    }

}
