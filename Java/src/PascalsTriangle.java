import java.util.*;

/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 * <p>
 * For example, given numRows = 5,
 * Return
 * <p>
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 * <p>
 * Accepted.
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> results = new ArrayList<>();
        if (numRows == 0) {
            return results;
        }
        if (numRows == 1) {
            results.add(Collections.singletonList(1));
            return results;
        }
        if (numRows == 2) {
            results.add(Collections.singletonList(1));
            results.add(Arrays.asList(1, 1));
            return results;
        }
        List<List<Integer>> tmp = generate(numRows - 1);
        List<Integer> list = new LinkedList<>();

        List<Integer> last = tmp.get(tmp.size() - 1);
        list.add(1);
        for (int i = 1; i < last.size(); i++) {
            list.add(last.get(i - 1) + last.get(i));
        }
        list.add(1);
        tmp.add(list);

        return tmp;
    }

}
