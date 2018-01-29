# -*- coding: UTF-8 -*-
#
# Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
#
# Note:
# You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
# The number of elements initialized in nums1 and nums2 are m and n respectively.
#
# Python, Python 3 accepted.


class MergeSortedArray:
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: void Do not return anything, modify nums1 in-place instead.
        """
        if n != 0:
            nums1[m:m + n] = nums2
            nums1[0:m + n] = sorted(nums1[0:m + n])
            # print(nums1)

