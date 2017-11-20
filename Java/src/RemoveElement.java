/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * Example:
 * Given input array nums = [3,2,2,3], val = 3
 * Your function should return length = 2, with the first two elements of nums being 2.
 * <p>
 * Accepted.
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0] == val ? 0 : 1;

        int lastIndex = nums.length - 1;
        for (int i = 0; i < lastIndex; i++) {
            if (nums[i] == val) {
                exchange2values(nums, i, lastIndex);
                lastIndex--;

                while (lastIndex > i && nums[i] == val) {
                    exchange2values(nums, i, lastIndex);
                    lastIndex--;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) return i;
        }

        return nums.length;
    }

    private void exchange2values(int[] nums, int i, int lastIndex) {
        if (lastIndex >= i && i >= 0) {
            int tmp = nums[lastIndex];
            nums[lastIndex] = nums[i];
            nums[i] = tmp;
        }
    }

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        // Expected:
        // nums: [2, 2, 3, 3] length = 2
        System.out.println(re.removeElement(new int[]{3, 2, 2, 3}, 3));
        // Expected:
        // nums: [3, 3] length = 0
        System.out.println(re.removeElement(new int[]{3, 3}, 3));
        // Expeted:
        // nums: [] length = 0
        System.out.println(re.removeElement(new int[]{}, 0));
        // Expected:
        // nums: [3, 4, 5, 888, 2, 2] length = 4
        System.out.println(re.removeElement(new int[]{2, 3, 4, 5, 888, 2}, 2));
        // Expected:
        // nums: [3, 3] length = 2
        System.out.println(re.removeElement(new int[]{3, 3}, 0));
    }

}
