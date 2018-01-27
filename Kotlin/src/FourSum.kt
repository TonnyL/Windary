/**
 * Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target?
 * Find all unique quadruplets in the array which gives the sum of target.
 *
 * Note: The solution set must not contain duplicate quadruplets.
 *
 * For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.
 *
 * A solution set is:
 * [
 * [-1,  0, 0, 1],
 * [-2, -1, 1, 2],
 * [-2,  0, 0, 2]
 * ]
 *
 * Accepted.
 */
class FourSum {

    // Accepted. 1600ms.
    /*fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        val set = mutableSetOf<List<Int>>()
        nums.sort()

        for (i in 0 until nums.size - 3) {
            for (j in i + 1 until nums.size - 2) {
                for (k in j + 1 until nums.size - 1) {
                    for (m in k + 1 until nums.size) {
                        val sum = nums[i] + nums[j] + nums[k] + nums[m]
                        if (sum > target) {
                            continue
                        }
                        if (sum == target) {
                            set.add(listOf(nums[i], nums[j], nums[k], nums[m]))
                        }
                    }
                }
            }
        }

        return ArrayList(set)
    }*/

    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        val results = mutableListOf<List<Int>>()
        nums.sort()

        for (i in 0 until nums.size - 3) {
            for (j in i + 1 until nums.size - 2) {
                var left = j + 1
                var right = nums.size - 1
                while (left < right) {
                    val sum = nums[i] + nums[j] + nums[left] + nums[right]
                    when {
                        sum == target -> {
                            val tmp = ArrayList<Int>(4)
                            tmp.add(nums[i])
                            tmp.add(nums[j])
                            tmp.add(nums[left])
                            tmp.add(nums[right])
                            if (!results.contains(tmp)) {
                                results.add(tmp)
                            }
                            left++
                            right--
                        }
                        sum < target -> left++
                        else -> right--
                    }
                }
            }
        }

        return results
    }

}
