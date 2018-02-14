# Given a binary tree, find its maximum depth.
#
# The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
#
# For example:
# Given binary tree [3,9,20,null,null,15,7],
#
#     3
#    / \
#   9  20
#     /  \
#    15   7
# return its depth = 3.
#
# Python, Python3 all accepted.


class MaximumDepthOfBinaryTree:
    def maxDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        maxDepth = 0
        return maxDepth if root is None else max(self.maxDepth(root.left), self.maxDepth(root.right)) + 1


class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None
