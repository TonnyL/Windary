import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a collection of distinct numbers, return all possible permutations.
 * <p>
 * For example,
 * [1,2,3] have the following permutations:
 * [
 * [1,2,3],
 * [1,3,2],
 * [2,1,3],
 * [2,3,1],
 * [3,1,2],
 * [3,2,1]
 * ]
 * <p>
 * Accepted.
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new LinkedList<>();

        if (nums.length == 0) {
            return results;
        }
        if (nums.length == 1) {
            List<Integer> list = new ArrayList<>(1);
            list.add(nums[0]);
            results.add(list);
            return results;
        }

        int[] ints = new int[nums.length - 1];
        System.arraycopy(nums, 0, ints, 0, nums.length - 1);

        for (List<Integer> list : permute(ints)) {
            for (int i = 0; i <= list.size(); i++) {
                List<Integer> tmp = new LinkedList<>(list);
                tmp.add(i, nums[nums.length - 1]);
                results.add(tmp);
            }
        }

        return results;
    }

}
