import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).
 * <p>
 * Note: The solution set must not contain duplicate subsets.
 * <p>
 * For example,
 * If nums = [1,2,2], a solution is:
 * <p>
 * [
 * [2],
 * [1],
 * [1,2,2],
 * [2,2],
 * [1,2],
 * []
 * ]
 * <p>
 * Accepted.
 */
public class SubsetsII {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Collections.emptyList();
        }

        List<List<Integer>> lists = new ArrayList<>();

        if (nums.length == 1) {
            // Add the empty list.
            lists.add(new ArrayList<>());

            List<Integer> list = new ArrayList<>(1);
            list.add(nums[0]);

            lists.add(list);

            return lists;
        }

        Arrays.sort(nums);

        for (List<Integer> list : subsetsWithDup(Arrays.copyOfRange(nums, 0, nums.length - 1))) {
            List<Integer> l = new ArrayList<>(list);
            l.add(nums[nums.length - 1]);

            if (!lists.contains(l)) {
                lists.add(l);
            }

            if (!lists.contains(list)) {
                lists.add(list);
            }
        }

        return lists;
    }

}
