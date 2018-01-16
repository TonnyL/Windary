package MergeSortedArray

import (
	"sort"
)

//Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
//
//Note:
//You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
//The number of elements initialized in nums1 and nums2 are m and n respectively.
//
//Accepted.

func merge(nums1 []int, m int, nums2 []int, n int) {
	if n != 0 {
		array := make([]int, 0)
		for i := 0; i < m; i++ {
			array = append(array, nums1[i])
		}

		for i := 0; i < n; i++ {
			array = append(array, nums2[i])
		}

		sort.Ints(array)

		for i := 0; i < len(array); i++ {
			nums1[i] = array[i]
		}
	}
}
