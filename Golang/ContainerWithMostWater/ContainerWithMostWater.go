package ContainerWithMostWater

//Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
//n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
//Find two lines, which together with x-axis forms a container, such that the container contains the most water.
//
//Note: You may not slant the container and n is at least 2.

func maxArea(height []int) int {
	heightLength := len(height)
	if heightLength < 2 {
		return 0
	}
	low, high, maxCapacity := 0, heightLength-1, 0

	for ; low < high; {
		c := (high - low) * min(height[low], height[high])
		if c > maxCapacity {
			maxCapacity = c
		}
		if height[low] < height[high] {
			low++
		} else {
			high--
		}
	}

	return maxCapacity
}

func min(a int, b int) int {
	if a < b {
		return a
	}
	return b
}
