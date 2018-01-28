/**
 * Implement pow(x, n).
 * <p>
 * Accepted.
 */
public class PowXN {

    public double myPow(double x, int n) {
        // 🌝 ok, this may be the simplest way to solve the problem, but a little tricky.
        // Accepted.
        // return Math.pow(x, n);

        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }

        double result = myPow(x, n / 2);
        if (n % 2 == 0) {
            return result * result;
        } else if (n > 0) {
            return x * result * result;
        }

        return (result * result) / x;
    }

}
