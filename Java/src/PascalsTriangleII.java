import java.util.ArrayList;
import java.util.List;

/**
 * Given an index k, return the kth row of the Pascal's triangle.
 * <p>
 * For example, given k = 3,
 * Return [1,3,3,1].
 * <p>
 * Note:
 * Could you optimize your algorithm to use only O(k) extra space?
 * <p>
 * Accepted.
 */

public class PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> results = new ArrayList<>();
        results.add(1);

        if (rowIndex == 0) {
            return results;
        }

        for (int i = 0; i < rowIndex; i++) {
            results.add(1);
            for (int j = results.size() - 2; j > 0; j--) {
                results.set(j, results.get(j - 1) + results.get(j));
            }
        }

        return results;
    }

}
