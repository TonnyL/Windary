import java.util.*;

/**
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 * <p>
 * For example,
 * [1,1,2] have the following unique permutations:
 * [
 * [1,1,2],
 * [1,2,1],
 * [2,1,1]
 * ]
 * <p>
 * Accepted.
 */
public class PermutationsII {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> results = new LinkedList<>();

        if (nums.length == 0) return results;
        if (nums.length == 1) {
            List<Integer> list = new LinkedList<>();
            list.add(nums[0]);
            results.add(list);
            return results;
        }

        int[] ints = new int[nums.length - 1];
        System.arraycopy(nums, 0, ints, 0, nums.length - 1);

        Set<List<Integer>> set = new HashSet<>();

        for (List<Integer> list : permuteUnique(ints)) {
            for (int i = 0; i <= list.size(); i++) {
                List<Integer> tmp = new LinkedList<>(list);
                tmp.add(i, nums[nums.length - 1]);
                set.add(tmp);
            }
        }

        results.addAll(set);
        return results;
    }

}
