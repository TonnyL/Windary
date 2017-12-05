import java.util.ArrayList;
import java.util.List;

/**
 * The gray code is a binary numeral system where two successive values differ in only one bit.
 * Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.
 * For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:
 * <p>
 * 00 - 0
 * 01 - 1
 * 11 - 3
 * 10 - 2
 * <p>
 * Note:
 * For a given n, a gray code sequence is not uniquely defined.
 * For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.
 * For now, the judge is able to judge based on one instance of gray code sequence. Sorry about that.
 * <p>
 * Accepted.
 */
public class GrayCode {

    public List<Integer> grayCode(int n) {
        List<Integer> resultList = new ArrayList<>();

        if (n <= 0) {
            resultList.add(0);
            return resultList;
        }

        if (n == 1) {
            resultList.add(0);
            resultList.add(1);
            return resultList;
        }

        resultList = grayCode(n - 1);
        for (int i = resultList.size() - 1; i >= 0; i--) {
            resultList.add(resultList.get(i) + (int) Math.pow(2, n - 1));
        }

        return resultList;

    }

    public static void main(String[] args) {
        GrayCode gc = new GrayCode();

        // Expected: [0]
        System.out.println(gc.grayCode(0));

        // Expected: [0, 1, 3, 2]
        System.out.println(gc.grayCode(2));

        // Expected: [0, 1, 3, 2, 6, 7, 5, 4]
        System.out.println(gc.grayCode(3));
    }

}
