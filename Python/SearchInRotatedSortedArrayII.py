# Follow up for "Search in Rotated Sorted Array":
# What if duplicates are allowed?
#
# Would this affect the run-time complexity? How and why?
#
# Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
#
# (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
#
# Write nums function to determine if nums given target is in the array.
#
# The array may contain duplicates.
#
# Python, Python3 all accepted.


class SearchInRotatedSortedArrayII:
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: bool
        """
        if nums is None:
            return False

        if len(nums) == 1:
            return nums[0] == target

        start = 0
        end = len(nums) - 1

        if end == 0:
            return False

        while start <= end:
            mid = start + (end - start) // 2
            if nums[mid] == target:
                return True
            # right half sorted
            if nums[mid] < nums[end]:
                if nums[mid] < target <= nums[end]:
                    start = mid + 1
                else:
                    end = mid - 1
            # left half sorted
            elif nums[mid] > nums[end]:
                if nums[start] <= target < nums[mid]:
                    end = mid - 1
                else:
                    start = mid + 1
            else:
                end -= 1

        return False
