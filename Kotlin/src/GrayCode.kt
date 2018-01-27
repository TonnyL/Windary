/**
 * The gray code is a binary numeral system where two successive values differ in only one bit.
 * Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.
 * For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:
 * <p>
 * 00 - 0
 * 01 - 1
 * 11 - 3
 * 10 - 2
 * <p>
 * Note:
 * For a given n, a gray code sequence is not uniquely defined.
 * For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.
 * For now, the judge is able to judge based on one instance of gray code sequence. Sorry about that.
 *
 * Accepted.
 */
class GrayCode {

    fun grayCode(n: Int): List<Int> {
        val resultList = mutableListOf<Int>()

        if (n <= 0) return resultList.apply {
            add(0)
        }
        if (n == 1) return resultList.apply {
            add(0)
            add(1)
        }

        grayCode(n - 1).forEach {
            resultList.add(it)
        }
        for (i in resultList.indices.reversed()) {
            resultList.add(resultList[i] + Math.pow(2.0, (n - 1).toDouble()).toInt())
        }

        return resultList.toList()
    }

}