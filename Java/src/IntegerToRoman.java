/**
 * Given an integer, convert it to a roman numeral.
 * <p>
 * Input is guaranteed to be within the range from 1 to 3999.
 * <p>
 * Accepted.
 */
public class IntegerToRoman {

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        char roman[] = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        int value[] = {1000, 500, 100, 50, 10, 5, 1};

        for (int n = 0; n < 7; n += 2) {
            int x = num / value[n];
            if (x < 4) {
                for (int i = 1; i <= x; i++) {
                    sb.append(roman[n]);
                }
            } else if (x == 4) {
                sb.append(roman[n]).append(roman[n - 1]);
            } else if (x < 9) {
                sb.append(roman[n - 1]);
                for (int i = 6; i <= x; i++) {
                    sb.append(roman[n]);
                }
            } else if (x == 9) {
                sb.append(roman[n]).append(roman[n - 2]);
            }
            num %= value[n];
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        IntegerToRoman i = new IntegerToRoman();

        // Expected: "I"
        System.out.println(i.intToRoman(1));

        // Expected: "DCXXI"
        System.out.println(i.intToRoman(621));

        // Expected: "MCMXCVI"
        System.out.println(i.intToRoman(1996));

        // Expected: "CMXCIX"
        System.out.println(i.intToRoman(999));
    }

}
