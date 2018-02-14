/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 *
 * For example, given numRows = 5,
 * Return
 *
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 *
 * Accepted.
 */
class PascalsTriangle {

    fun generate(numRows: Int): List<List<Int>> {
        val results = mutableListOf<List<Int>>()
        if (numRows == 0) {
            return results
        }
        if (numRows == 1) {
            results.add(listOf(1))
            return results
        }
        if (numRows == 2) {
            results.add(listOf(1))
            results.add(listOf(1, 1))
            return results
        }
        val tmp = generate(numRows - 1).toMutableList()
        val list = mutableListOf<Int>()

        val last = tmp[tmp.size - 1]
        list.add(1)
        (1 until last.size).mapTo(list) {
            last[it - 1] + last[it]
        }
        list.add(1)
        tmp.add(list)

        return tmp
    }

}
