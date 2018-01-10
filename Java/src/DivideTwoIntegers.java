/**
 * Divide two integers without using multiplication, division and mod operator.
 * <p>
 * If it is overflow, return MAX_INT.
 * <p>
 * Accepted.
 */
public class DivideTwoIntegers {

    public int divide(int dividend, int divisor) {
        long longDividend = Math.abs((long) dividend);
        long longDivisor = Math.abs((long) divisor);
        long result = 0;

        while (longDividend >= longDivisor) {
            long tmpDivisor = longDivisor;
            int i = 0;

            while (tmpDivisor <= longDividend) {
                longDividend -= tmpDivisor;
                tmpDivisor = tmpDivisor << 1;
                result += 1 << i;
                i++;
            }

        }

        if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) {
            result = -result;
        }

        return result < Integer.MIN_VALUE || result > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) result;
    }

    public static void main(String[] args) {
        DivideTwoIntegers d = new DivideTwoIntegers();

        // Expected: 1
        System.out.println(d.divide(1, 1));

        // Expected: 0
        System.out.println(d.divide(0, 1));

        // Expected: 1
        System.out.println(d.divide(-1, -1));

        // Expected: 2147483647
        System.out.println(d.divide(Integer.MAX_VALUE, 1));

        // Expected: 0
        System.out.println(d.divide(Integer.MAX_VALUE, Integer.MIN_VALUE));

        // Expected: 2147483647
        System.out.println(d.divide(Integer.MIN_VALUE, -1));

        // Expected: 16
        System.out.println(d.divide(100, 6));
    }

}
