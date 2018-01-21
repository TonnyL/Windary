import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given a collection of candidate numbers (C) and a target number (T),
 * find all unique combinations in C where the candidate numbers sums to T.
 * <p>
 * Each number in C may only be used once in the combination.
 * <p>
 * Note:
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8,
 * A solution set is:
 * [
 * [1, 7],
 * [1, 2, 5],
 * [2, 6],
 * [1, 1, 6]
 * ]
 * <p>
 * Accepted.
 */

public class CombinationSumII {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates.length == 0) {
            return Collections.emptyList();
        }
        List<List<Integer>> lists = new ArrayList<>();

        Arrays.sort(candidates);

        dfs(candidates, target, new ArrayList<>(), lists, 0);

        return lists;
    }

    private void dfs(int[] candidates, int target, List<Integer> path, List<List<Integer>> ret, int index) {
        if (target < 0) {
            return;
        }

        if (target == 0) {
            ret.add(new ArrayList<>(path));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (i != index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            path.add(candidates[i]);
            dfs(candidates, target - candidates[i], path, ret, i + 1);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        CombinationSumII cs = new CombinationSumII();

        // Expected: [[1, 7], [1, 2, 5], [2, 6], [1, 1, 6]]
        System.out.println(cs.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));

        // Expected: []
        System.out.println(cs.combinationSum2(new int[]{1}, 2));

        // Expected: [[1, 1, 2], [2, 2]]
        System.out.println(cs.combinationSum2(new int[]{1, 1, 2, 2}, 4));
    }

}
