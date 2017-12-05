import java.util.*;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Note: The solution set must not contain duplicate triplets.
 * <p>
 * For example, given array S = [-1, 0, 1, 2, -1, -4],
 * <p>
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 * <p>
 * Accepted.
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<Triple> set = new HashSet<>();

        for (int first = 0; first < nums.length - 2; first++) {
            if (nums[first] > 0) break;

            int target = 0 - nums[first];
            int second = first + 1;
            int third = nums.length - 1;

            while (second < third) {
                if (nums[second] + nums[third] == target) {
                    set.add(new Triple(nums[first], nums[second], nums[third]));
                    while (second < third && nums[second] == nums[second + 1]) {
                        second++;
                    }
                    while (second < third && nums[third] == nums[third - 1]) {
                        third--;
                    }
                    second++;
                    third--;
                } else if (nums[second] + nums[third] < target) {
                    second++;
                } else {
                    third--;
                }
            }
        }

        List<List<Integer>> lists = new ArrayList<>();

        set.forEach(t -> {
            List<Integer> list = new ArrayList<>(3);
            list.add(t.a);
            list.add(t.b);
            list.add(t.c);
            lists.add(list);
        });

        return lists;
    }

    static class Triple {

        private int a;
        private int b;
        private int c;

        public Triple(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Triple) {
                Triple t = (Triple) obj;
                return a == t.a && b == t.b && c == t.c;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return (-a) * 100 + Math.abs(b) * 10 + c;
        }
    }

    public static void main(String[] args) {
        ThreeSum ts = new ThreeSum();

        // Expected: []
        System.out.println(ts.threeSum(new int[]{-1, 0}));

        // Expected: [[-1, -1, 2], [-1, 0, 1]]
        System.out.println(ts.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));

        // Expected: [[0, 0, 0]]
        System.out.println(ts.threeSum(new int[]{0, 0, 0}));

        // Expected: [[-4, -2, 6], [-4, 0, 4], [-4, 1, 3], [-4, 2, 2], [-2, -2, 4], [-2, 0, 2]]
        System.out.println(ts.threeSum(new int[]{-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6}));
    }

}
