import java.util.Arrays;

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

    public static void main(String[] args) {
        PlusOne po = new PlusOne();

        // Expected: [2]
        System.out.println(Arrays.toString(po.plusOne(new int[]{1})));

        // Expected: [1, 0]
        System.out.println(Arrays.toString(po.plusOne(new int[]{9})));

        // Expected: [1, 0, 0]
        System.out.println(Arrays.toString(po.plusOne(new int[]{9, 9})));

        // Expected: [2, 9, 0, 0, 0]
        System.out.println(Arrays.toString(po.plusOne(new int[]{2, 8, 9, 9, 9})));

        // Expected: [2, 8, 9, 0]
        System.out.println(Arrays.toString(po.plusOne(new int[]{2, 8, 8, 9})));
    }

}
