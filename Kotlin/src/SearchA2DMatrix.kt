/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 *
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * For example,
 *
 * Consider the following matrix:
 *
 * [
 * [1,   3,  5,  7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * Given target = 3, return true.
 *
 * Accepted.
 */
class SearchA2DMatrix {

    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        if (matrix.isEmpty() || matrix[0].isEmpty()) {
            return false
        }

        for (i in 0 until matrix.size - 1) {
            if (matrix[i][0] == target || matrix[i + 1][0] == target) {
                return true
            } else if (matrix[i][0] < target && matrix[i + 1][0] > target) {
                return matrix[i].binarySearch(target) >= 0
            }
        }

        return matrix[matrix.size - 1].binarySearch(target) >= 0
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val s = SearchA2DMatrix()

            // Expected: false
            println(s.searchMatrix(arrayOf(), 0))

            // Expected: false
            println(s.searchMatrix(arrayOf(intArrayOf()), 1))

            // Expected: true
            println(s.searchMatrix(arrayOf(intArrayOf(1, 3, 5, 7), intArrayOf(10, 11, 16, 20), intArrayOf(23, 30, 34, 50)), 3))

            // Expected: true
            println(s.searchMatrix(arrayOf(intArrayOf(1)), 1))
        }
    }

}