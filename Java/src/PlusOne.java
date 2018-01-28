/**
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * The digits are stored such that the most significant digit is at the head of the list.
 * <p>
 * Accepted.
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        boolean flag = false;
        digits[digits.length - 1]++;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (flag) digits[i]++;
            if (digits[i] >= 10) {
                flag = true;
                digits[i] %= 10;
            } else {
                flag = false;
            }
        }

        if (flag) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }

        return digits;
    }

}
