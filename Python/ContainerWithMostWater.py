# -*- coding: UTF-8 -*-
#
# Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
# n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
# Find two lines, which together with x-axis forms a container, such that the container contains the most water.
#
# Note: You may not slant the container and n is at least 2.
#
#
class ContainerWithMostWater:
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        if len(height) < 2:
            return 0

        low = 0
        high = len(height) - 1
        max_capacity = 0

        while low < high:
            cap = (high - low) * min(height[low], height[high])
            if cap > max_capacity:
                max_capacity = cap
            if height[low] < height[high]:
                low += 1
            else:
                high -= 1

        return max_capacity


cwmw = ContainerWithMostWater()

# Expected: 1
print(cwmw.maxArea([1, 1]))

# Expected: 4
print(cwmw.maxArea([1, 4, 9]))

# Expected: 8
print(cwmw.maxArea([1, 4, 9, 4]))
