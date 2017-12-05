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
        if (matrix.isEmpty() || matrix[0].isEmpty()) return ArrayList()

        val capacity = matrix.size * matrix[0].size
        val result = ArrayList<Int>(capacity)
        val added = Array(matrix.size) { BooleanArray(matrix[0].size) }

        if (matrix.size == 1) {
            matrix[0].forEach { result.add(it) }
            return result
        }

        if (matrix[0].size == 1) {
            matrix.forEach { result.add(it[0]) }
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

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val sm = SpiralMatrix()

            // []
            println(sm.spiralOrder(arrayOf()))

            // [1, 2, 3]
            println(sm.spiralOrder(arrayOf(intArrayOf(1), intArrayOf(2), intArrayOf(3))))

            // [1, 2, 3]
            println(sm.spiralOrder(arrayOf(intArrayOf(1, 2, 3))))

            // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11]
            println(sm.spiralOrder(arrayOf(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), intArrayOf(11, 12, 13, 14, 15, 16, 17, 18, 19, 20))))

            // [1, 2, 4, 3]
            println(sm.spiralOrder(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))))

            // [1, 2, 4, 6, 5, 3]
            println(sm.spiralOrder(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(5, 6))))

            // [1, 2, 3, 6, 9, 8, 7, 4, 5]
            println(sm.spiralOrder(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))))

            // [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
            println(sm.spiralOrder(arrayOf(intArrayOf(1, 2, 3, 4), intArrayOf(5, 6, 7, 8), intArrayOf(9, 10, 11, 12))))
        }
    }

}