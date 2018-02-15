# Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
#
# For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
#
# 1
# / \
# 2   2
# / \ / \
# 3  4 4  3
# But the following [1,2,2,null,3,null,3] is not:
# 1
# / \
# 2   2
# \   \
# 3    3
# Note:
# Bonus points if you could solve it both recursively and iteratively.
#
# Python, Python3 all accepted.


class SymmetricTree:
    def isSymmetric(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        return self.isMirror(root, root)

    def isMirror(self, left, right):
        """
        :param left:
        :param right:
        :return:
        """
        return left is None and right is None or left is not None and right is not None and left.val == right.val and self.isMirror(
            left.right, right.left) and self.isMirror(left.left, right.right)


class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None
