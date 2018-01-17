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

    public static void main(String[] args) {
        PowXN pxn = new PowXN();
        // Expected: 4
        System.out.println(pxn.myPow(2, 2));
        // Expected: 700.28148
        System.out.println(pxn.myPow(8.88023, 3));
        // Expected: 0.25
        System.out.println(pxn.myPow(2, -2));
        // Expected: 0.0
        System.out.println(pxn.myPow(0.00001, 2147483647));
        // Expected: 0.00003
        System.out.println(pxn.myPow(34.00515, -3));
    }

}
