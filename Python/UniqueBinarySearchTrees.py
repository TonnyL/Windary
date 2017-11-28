# -*- coding: UTF-8 -*-
#
# Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
#
# For example,
# Given n = 3, there are a total of 5 unique BST's.
#
# 1        3     3      2      1
# \       /     /      / \      \
# 3      2     1      1   3      2
# /     /      \                 \
# 2    1       2                 3
#
#
class UniqueBinarySearchTrees:

    # Recursive solution. Time limit exceeded.
    # def numTrees(self, n):
    #     """
    #     :type n: int
    #     :rtype: int
    #     """
    #     if n == 0 or n == 1:
    #         return 1
    #
    #     r = 0
    #     for i in range(1, n + 1):
    #         r += self.numTrees(i - 1) * self.numTrees(n - i)
    #
    #     return r

    # Dynamic programming.
    def numTrees(self, n):
        """
        :type n: int
        :rtype: int
        """
        array = [0 for i in range(n + 2)]
        array[0] = 1
        array[1] = 1

        for i in range(2, n + 1):
            for j in range(i):
                array[i] += array[j] * array[i - j - 1]

        return array[n]


u = UniqueBinarySearchTrees()

# Expected: 1
print(u.numTrees(0))

# Expected: 1
print(u.numTrees(1))

# Expected: 2
print(u.numTrees(2))

# Expected: 5
print(u.numTrees(3))

# Expected: 14
print(u.numTrees(4))
