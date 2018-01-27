/**
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 *
 * For example,
 * Given n = 3, there are a total of 5 unique BST's.
 *
 * 1        3     3      2      1
 * \       /     /      / \      \
 * 3      2     1      1   3      2
 * /     /      \                 \
 * 2    1       2                 3
 *
 * Two solutions are all accepted.
 */
class UniqueBinarySearchTrees {

    // Recursive solution. Accepted.
    /*fun numTrees(n: Int): Int {
        if (n == 0 || n == 1) return 1

        return (1..n).sumBy {
            numTrees(it - 1) * numTrees(n - it)
        }
    }*/

    // Dynamic programming.
    fun numTrees(n: Int): Int {
        val array = IntArray(n + 2, { 0 })
        array[0] = 1
        array[1] = 1

        for (i in 2..n) {
            for (j in 0 until i) {
                array[i] += array[j] * array[i - j - 1]
            }
        }

        return array[n]
    }

}
