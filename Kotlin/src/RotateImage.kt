/**
 * You are given an n x n 2D matrix representing an image.
 *
 * Rotate the image by 90 degrees (clockwise).
 *
 * Note:
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 *
 * Example 1:
 *
 * Given input matrix =
 * [
 * [1,2,3],
 * [4,5,6],
 * [7,8,9]
 * ],
 *
 * rotate the input matrix in-place such that it becomes:
 * [
 * [7,4,1],
 * [8,5,2],
 * [9,6,3]
 * ]
 * Example 2:
 *
 * Given input matrix =
 * [
 * [ 5, 1, 9,11],
 * [ 2, 4, 8,10],
 * [13, 3, 6, 7],
 * [15,14,12,16]
 * ],
 *
 * rotate the input matrix in-place such that it becomes:
 * [
 * [15,13, 2, 5],
 * [14, 3, 4, 1],
 * [12, 6, 8, 9],
 * [16, 7,10,11]
 * ]
 *
 * Accepted.
 */
class RotateImage {

    fun rotate(matrix: Array<IntArray>) {
        // Reverse
        for (i in 0 until matrix.size / 2) {
            val j = matrix.size - 1 - i
            val cache = matrix[i]
            matrix[i] = matrix[j]
            matrix[j] = cache
        }
        // Transpose
        for (i in matrix.indices) {
            for (j in i + 1 until matrix.size) {
                val cache = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = cache
            }
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val ri = RotateImage()

            arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)).let {
                ri.rotate(it)
                println("[${it.joinToString { "[${it.joinToString()}]" }}]")
            }

            arrayOf(intArrayOf(5, 1, 9, 11), intArrayOf(2, 4, 8, 10), intArrayOf(13, 3, 6, 7), intArrayOf(15, 14, 12, 16)).let {
                ri.rotate(it)
                println("[${it.joinToString { "[${it.joinToString()}]" }}]")
            }
        }
    }

}
