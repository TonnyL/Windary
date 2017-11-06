/**
 * Given two binary strings, return their sum (also a binary string).
 * <p>
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 * <p>
 * Accepted.
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        if (a == null || b == null) return "";
        if (a.isEmpty()) return b;
        if (b.isEmpty()) return a;

        boolean flag = false; // if it needs to plus one

        String longer = a.length() >= b.length() ? a : b;
        String shorter = a.length() < b.length() ? a : b;

        StringBuilder sb = new StringBuilder(longer.length() + 1);

        for (int i = longer.length() - 1, j = shorter.length() - 1; i >= 0; i--, j--) {
            if (j < 0) {
                if (longer.charAt(i) == '1') {
                    if (flag)
                        sb.append('0');
                    else
                        sb.append('1');
                } else { // l == '0'
                    if (flag) {
                        sb.append('1');
                        flag = false;
                    } else
                        sb.append('0');
                }
            } else {
                if ((longer.charAt(i) == '1' && shorter.charAt(j) == '1')) {
                    if (flag)
                        sb.append('1');
                    else
                        sb.append('0');
                    flag = true;
                } else if (longer.charAt(i) == '0' && shorter.charAt(j) == '0') {
                    if (flag)
                        sb.append('1');
                    else
                        sb.append('0');
                    flag = false;
                } else { // (l == '1' && s == '0') || (l == '0' && s == '1')
                    if (flag) {
                        sb.append('0');
                        flag = true;
                    } else
                        sb.append('1');
                }
            }

        }
        if (flag) sb.append('1');

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary ab = new AddBinary();

        // Expected: 0
        System.out.println(ab.addBinary("0", "0"));
        // Expected: 100
        System.out.println(ab.addBinary("11", "1"));
        // Expected: 1010
        System.out.println(ab.addBinary("101", "101"));
    }

}
