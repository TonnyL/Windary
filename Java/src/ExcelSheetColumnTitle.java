/**
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * <p>
 * For example:
 * <p>
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 * <p>
 * Accepted.
 */
public class ExcelSheetColumnTitle {

    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            if (n % 26 == 0) {
                sb.append('Z');
                n -= 26;
            } else {
                sb.append(Character.toString((char) (n % 26 - 1 + 'A')));
                n -= n % 26;
            }
            n /= 26;
        }

        return sb.reverse().toString();
    }

}
