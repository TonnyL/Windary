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

}
