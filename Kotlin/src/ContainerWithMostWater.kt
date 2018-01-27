/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 *
 * Note: You may not slant the container and n is at least 2.
 */
class ContainerWithMostWater {

    fun maxArea(height: IntArray): Int {
        if (height.size < 2) {
            return 0
        }
        var low = 0
        var high = height.size - 1
        var maxCapacity = 0

        while (low < high) {
            val cap = (high - low) * Math.min(height[low], height[high])
            if (cap > maxCapacity) {
                maxCapacity = cap
            }
            if (height[low] < height[high]) {
                low++
            } else {
                high--
            }
        }

        return maxCapacity
    }

}