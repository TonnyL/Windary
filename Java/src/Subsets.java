import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 * <p>
 * Note: The solution set must not contain duplicate subsets.
 * <p>
 * For example,
 * If nums = [1,2,3], a solution is:
 * <p>
 * [
 * [3],
 * [1],
 * [2],
 * [1,2,3],
 * [1,3],
 * [2,3],
 * [1,2],
 * []
 * ]
 * <p>
 * Accepted.
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new LinkedList<>();
        results.add(new LinkedList<>());

        if (nums == null || nums.length == 0) {
            return results;
        }

        Arrays.sort(nums);

        for (int i : nums) {
            int size = results.size();
            for (int j = 0; j < size; j++) {
                List<Integer> list = new LinkedList<>();
                list.addAll(results.get(j));
                list.add(i);

                results.add(list);
            }
        }

        return results;
    }

}
