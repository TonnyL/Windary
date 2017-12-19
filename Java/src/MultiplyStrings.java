/**
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2.
 * <p>
 * Note:
 * <p>
 * The length of both num1 and num2 is < 110.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 * <p>
 * Accepted.
 */
public class MultiplyStrings {

    public String multiply(String num1, String num2) {
        int[] ints = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                ints[(num1.length() - i - 1) + (num2.length() - j - 1)] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ints.length; i++) {
            int digit = ints[i] % 10;
            int carry = ints[i] / 10;
            sb.insert(0, digit);
            if (i < ints.length - 1) {
                ints[i + 1] += carry;
            }
        }

        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        MultiplyStrings ms = new MultiplyStrings();

        System.out.println(ms.multiply("", "").equals("0"));

        System.out.println(ms.multiply("0", "0").equals("0"));

        System.out.println(ms.multiply("100", "1").equals("100"));

        System.out.println(ms.multiply("123", "45").equals("5535"));

        System.out.println(ms.multiply("99", "99").equals("9801"));

        System.out.println(ms.multiply("123", "123").equals("15129"));

        System.out.println(ms.multiply("123456789", "123456789").equals("15241578750190521"));
    }

}
