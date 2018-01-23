import java.util.Arrays;

/**
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 * <p>
 * If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
 * <p>
 * The replacement must be in-place, do not allocate extra memory.
 * <p>
 * Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 * <p>
 * Accepted.
 */
public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }

    public static void main(String[] args) {
        NextPermutation np = new NextPermutation();

        // Expected: [1, 3, 2]
        int[] array123 = new int[]{1, 2, 3};
        np.nextPermutation(array123);
        System.out.println(Arrays.toString(array123));

        // Expected: [1, 2, 3]
        int[] array321 = new int[]{3, 2, 1};
        np.nextPermutation(array321);
        System.out.println(Arrays.toString(array321));

        // Expected: [1, 5, 1]
        int[] array115 = new int[]{1, 1, 5};
        np.nextPermutation(array115);
        System.out.println(Arrays.toString(array115));
    }

}
