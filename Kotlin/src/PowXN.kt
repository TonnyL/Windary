/**
 * Implement pow(x, n).
 */
class PowXN {

    fun myPow(x: Double, n: Int): Double {
        // 🌝 ok, this may be the simplest way to solve the problem, but a little tricky.
        // return Math.pow(x, n.toDouble())

        if (n == 0) return 1.0
        if (n == 1) return x

        val result = myPow(x, n / 2)
        if (n % 2 == 0)
            return result * result
        else if (n > 0) {
            return x * result * result
        }
        return result * result / x
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val pxn = PowXN()
            // Expected: 4
            println(pxn.myPow(2.0, 2))
            // Expected: 700.28148
            println(pxn.myPow(8.88023, 3))
            // Expected: 0.5
            println(pxn.myPow(2.0, -2))
            // Expected: 0.0
            println(pxn.myPow(0.00001, 2147483647))
            // Expected: 0.00003
            println(pxn.myPow(34.00515, -3))
        }
    }

}