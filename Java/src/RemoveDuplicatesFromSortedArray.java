/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * For example,
 * Given input array nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

//        for (int j : nums) {
//            System.out.print(j + " ");
//        }
//        System.out.println();

        return i + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
        // Expected: [], length = 0
        System.out.println(r.removeDuplicates(new int[]{}));
        // Expected: [1, 2, 2], length = 2
        System.out.println(r.removeDuplicates(new int[]{1, 2, 2}));
        // Expected: [1, 1, 1], length = 1
        System.out.println(r.removeDuplicates(new int[]{1, 1, 1}));
        // Expected: [1, 2, 3, 4, 4], length = 4
        System.out.println(r.removeDuplicates(new int[]{1, 1, 2, 3, 4}));
    }

}
