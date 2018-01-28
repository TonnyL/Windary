/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * <p>
 * Note: You may not slant the container and n is at least 2.
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        if (height.length < 2) {
            return 0;
        }
        int low = 0, high = height.length - 1, maxCapacity = 0;

        while (low < high) {
            int cap = (high - low) * Math.min(height[low], height[high]);
            if (cap > maxCapacity) maxCapacity = cap;
            if (height[low] < height[high]) low++;
            else high--;
        }

        return maxCapacity;
    }

}
