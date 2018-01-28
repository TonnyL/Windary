/**
 * Implement int sqrt(int x).
 * Compute and return the square root of x.
 * <p>
 * Accepted.
 */
public class SqrtX {

    public int mySqrt(int x) {
        // A tricky way to solve the problem.
        // return (int) Math.sqrt(x);
        if (x <= 0) {
            return 0;
        }
        if (x <= 3) {
            return 1;
        }

        int high = x / 2, low = 1;
        // To avoid overflow.
        if (x >= 46340 * 46340) {
            return 46340;
        }
        if (high > 46340) {
            high = 46340;
        }

        int mid = (high + 1) / 2;
        do {
            if (mid * mid > x) {
                high = mid - 1;
            } else if (mid * mid < x) {
                if ((mid + 1) * (mid + 1) > x) {
                    return mid;
                }
                low = mid + 1;
            } else {
                return mid;
            }
            mid = (low + high) / 2;
        } while (high > low);

        return mid;
    }

}
