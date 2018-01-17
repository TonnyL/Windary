/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Note: Given n will be a positive integer.
 *
 * Accepted.
 */
class ClimbingStairs {

    fun climbStairs(n: Int): Int {
        if (n <= 0) {
            return 0
        }
        if (n == 1 || n == 2) {
            return n
        }

        val results = IntArray(n)
        results[0] = 1
        results[1] = 2

        for (i in 2 until n) {
            results[i] = results[i - 1] + results[i - 2]
        }

        return results[n - 1]
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val cs = ClimbingStairs()
            // Expected: 1
            println(cs.climbStairs(1))
            // Expected: 3
            println(cs.climbStairs(3))
            // Expected: 8
            println(cs.climbStairs(5))
        }
    }

}