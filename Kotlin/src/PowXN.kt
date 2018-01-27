/**
 * Implement pow(x, n).
 *
 * Accepted.
 */
class PowXN {

    fun myPow(x: Double, n: Int): Double {
        // 🌝 ok, this may be the simplest way to solve the problem, but a little tricky.
        // return Math.pow(x, n.toDouble())

        if (n == 0) {
            return 1.0
        }
        if (n == 1) {
            return x
        }

        val result = myPow(x, n / 2)
        if (n % 2 == 0) {
            return result * result
        } else if (n > 0) {
            return x * result * result
        }

        return result * result / x
    }

}