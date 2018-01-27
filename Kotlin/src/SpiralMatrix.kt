/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 *
 * For example,
 * Given the following matrix:
 *
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * You should return [1,2,3,6,9,8,7,4,5].
 *
 * Accepted.
 */
class SpiralMatrix {

    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        if (matrix.isEmpty() || matrix[0].isEmpty()) {
            return listOf()
        }

        val capacity = matrix.size * matrix[0].size
        val result = ArrayList<Int>(capacity)
        val added = Array(matrix.size) { BooleanArray(matrix[0].size) }

        if (matrix.size == 1) {
            matrix[0].mapTo(result) {
                it
            }
            return result
        }

        if (matrix[0].size == 1) {
            matrix.mapTo(result) {
                it[0]
            }
            return result
        }

        val centerX = if (matrix.size % 2 == 0) (matrix.size - 1) / 2 else matrix.size / 2
        val centerY = if (matrix[0].size % 2 == 0) (matrix[0].size - 1) / 2 else matrix[0].size / 2
        var i = 0
        var j = 0
        var depth = 0
        while (i <= centerX && j <= centerY && depth <= centerX && depth <= centerY) {
            j = depth
            i = depth
            while (j < matrix[0].size - depth) {
                if (!added[i][j]) {
                    result.add(matrix[i][j])
                    added[i][j] = true
                }
                j++
            }

            j--
            i++
            while (i < matrix.size - depth) {
                if (!added[i][j]) {
                    result.add(matrix[i][j])
                    added[i][j] = true
                }
                i++
            }

            i--
            j--
            while (j >= depth) {
                if (!added[i][j]) {
                    result.add(matrix[i][j])
                    added[i][j] = true
                }
                j--
            }

            j++
            i--
            while (i > depth) {
                if (!added[i][j]) {
                    result.add(matrix[i][j])
                    added[i][j] = true
                }
                i--
            }

            depth++
        }
        return result
    }

}