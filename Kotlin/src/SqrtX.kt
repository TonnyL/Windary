/**
 * Implement int sqrt(int x).
 * Compute and return the square root of x.
 *
 * Accepted.
 */
class SqrtX {

    fun mySqrt(x: Int): Int {
        // A tricky way to solve the problem.
        // return Math.sqrt(x.toDouble()).toInt()
        if (x <= 0) {
            return 0
        }
        if (x <= 3) {
            return 1
        }

        var high = x / 2
        var low = 1
        // To avoid overflow.
        if (x >= 46340 * 46340) {
            return 46340
        }
        if (high > 46340) {
            high = 46340
        }

        var mid = (high + 1) / 2
        do {
            when {
                mid * mid > x -> high = mid - 1
                mid * mid < x -> {
                    if ((mid + 1) * (mid + 1) > x) {
                        return mid
                    }
                    low = mid + 1
                }
                else -> return mid
            }
            mid = (low + high) / 2
        } while (high > low)

        return mid
    }

}