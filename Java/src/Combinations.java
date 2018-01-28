import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 * <p>
 * For example,
 * If n = 4 and k = 2, a solution is:
 * <p>
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 */
public class Combinations {

    // Iterative solution.
    // Accepted.
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> results = new ArrayList<>();
        if (n == 0 || k == 0 || k > n) {
            return results;
        }

        for (int i = 1; i <= n + 1 - k; i++) {
            results.add(Collections.singletonList(i));
        }

        for (int i = 2; i <= k; i++) {
            List<List<Integer>> tmp = new ArrayList<>();
            for (List<Integer> list : results) {
                for (int m = list.get(list.size() - 1) + 1; m <= n - (k - i); m++) {
                    List<Integer> newList = new ArrayList<>(list);
                    newList.add(m);
                    tmp.add(newList);
                }
            }
            results = tmp;
        }
        return results;
    }

    // Recursive solution.
    // Time Limit Exceeded.
    /*public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> results = new ArrayList<>();
        if (n == 0 || k == 0 || k > n) {
            return results;
        }

        if (k == 1) {
            for (int i = 1; i <= n; i++) {
                List<Integer> list = new ArrayList<>(1);
                list.add(i);
                results.add(list);
            }
            return results;
        }

        for (List<Integer> list : combine(n, k - 1)) {
            for (int i = list.get(list.size() - 1); i < n; i++) {
                List<Integer> tmp = new ArrayList<>(list);
                tmp.add(i + 1);
                results.add(tmp);
            }
        }

        return results;
    }*/

}
