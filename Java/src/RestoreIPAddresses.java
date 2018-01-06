import java.util.ArrayList;
import java.util.List;

/**
 * Given a string containing only digits, restore it by returning all possible valid IP address combinations.
 * <p>
 * For example:
 * Given "25525511135",
 * <p>
 * return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
 * <p>
 * Accepted.
 */
public class RestoreIPAddresses {

    public List<String> restoreIpAddresses(String s) {
        List<String> results = new ArrayList<>();
        if (s == null || s.length() < 4 || s.length() > 12) {
            return results;
        }

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                for (int k = 1; k < 4; k++) {
                    for (int m = 1; m < 4; m++) {
                        if (i + j + k + m == s.length()) {
                            int a = Integer.valueOf(s.substring(0, i));
                            int b = Integer.valueOf(s.substring(i, j + i));
                            int c = Integer.valueOf(s.substring(i + j, k + i + j));
                            int d = Integer.valueOf(s.substring(i + j + k, m + i + j + k));
                            if (a <= 255 && b <= 255 && c <= 255 && d <= 255) {
                                String str = String.valueOf(a) + "." + b + "." + c + "." + d;
                                if (str.length() == s.length() + 3) {
                                    results.add(str);
                                }
                            }
                        }
                    }
                }
            }
        }

        return results;
    }

    public static void main(String[] args) {
        RestoreIPAddresses r = new RestoreIPAddresses();

        // Expected: []
        System.out.println(r.restoreIpAddresses("1"));

        // Expected: []
        System.out.println(r.restoreIpAddresses("111"));

        // Expected: []
        System.out.println(r.restoreIpAddresses("1111111111111"));

        // Expected: ["1.1.1.1"]
        System.out.println(r.restoreIpAddresses("1111"));

        // Expected: ["255.255.11.135", "255.255.111.35"]
        System.out.println(r.restoreIpAddresses("25525511135"));
    }

}
