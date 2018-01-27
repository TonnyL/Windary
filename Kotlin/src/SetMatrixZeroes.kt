/**
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
 *
 * Accepted.
 */
class SetMatrixZeroes {

    fun setZeroes(matrix: Array<IntArray>) {
        if (matrix.isEmpty() || matrix[0].isEmpty()) {
            return
        }

        val row = HashSet<Int>(matrix.size)
        val column = HashSet<Int>(matrix[0].size)
        matrix.indices.forEach { i ->
            (0 until matrix[0].size).forEach {
                if (matrix[i][it] == 0) {
                    row.add(i)
                    column.add(it)
                }
            }
        }

        row.forEach { i ->
            (0 until matrix[0].size).forEach {
                matrix[i][it] = 0
            }
        }

        column.forEach { i ->
            (0 until matrix.size).forEach {
                matrix[it][i] = 0
            }
        }

    }

}