# Given an integer n, generate all structurally unique BST's (binary search trees) that store values 1...n.
#
# For example,
# Given n = 3, your program should return all 5 unique BST's shown below.
#
# 1       3     3      2      1
# \      /     /      / \      \
# 3     2     1      1  3      2
# /    /       \                \
# 2   1        2                 3
#
# Python, Python3 all accepted.


class UniqueBinarySearchTreesII:
    def generateTrees(self, n):
        """
        :type n: int
        :rtype: List[TreeNode]
        """
        return [] if n <= 0 else self.gen(1, n)

    def gen(self, start, end):
        """
        :param start: int
        :param end: int
        :return: List[TreeNode]
        """
        result = []
        if start > end:
            result.append(None)
            return result
        if start == end:
            result.append(TreeNode(start))
            return result

        for i in range(start, end + 1):
            for m in self.gen(start, i - 1):
                for n in self.gen(i + 1, end):
                    root = TreeNode(i)
                    root.left = m
                    root.right = n
                    result.append(root)

        return result


class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

    def __eq__(self, other):
        return self.val == other.val and self.left == other.left and self.right == other.right
