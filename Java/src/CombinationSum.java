import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given a set of candidate numbers (C) (without duplicates) and a target number (T),
 * find all unique combinations in C where the candidate numbers sums to T.
 * <p>
 * The same repeated number may be chosen from C unlimited number of times.
 * <p>
 * Note:
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set [2, 3, 6, 7] and target 7,
 * A solution set is:
 * [
 * [7],
 * [2, 2, 3]
 * ]
 * <p>
 * Accepted.
 */
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0) {
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
            path.add(candidates[i]);
            dfs(candidates, target - candidates[i], path, ret, i);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        CombinationSum cs = new CombinationSum();

        // Expected: [[7], [2, 2, 3]]
        System.out.println(cs.combinationSum(new int[]{2, 3, 6, 7}, 7));

        // Expected: [[1, 1, 1]]
        System.out.println(cs.combinationSum(new int[]{1}, 3));

        // Expected: [[1, 1, 1, 1], [1, 1, 2], [2, 2]]
        System.out.println(cs.combinationSum(new int[]{1, 2}, 4));
    }

}
