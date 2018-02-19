# Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
#
# For example:
# Given binary tree [3,9,20,null,null,15,7],
# 3
# / \
# 9  20
# /  \
# 15   7
# return its bottom-up level order traversal as:
# [
# [15,7],
# [9,20],
# [3]
# ]
#
# Python, Python3 all accepted.


class BinaryTreeLevelOrderTraversalII:
    def levelOrderBottom(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        lists = []
        self.helper(lists, root, 0)
        lists.reverse()
        return lists

    def helper(self, res, root, height):
        """
        :param res: List[List[int]]
        :param root: TreeNode
        :param height: Int
        :return:
        """
        if root is None:
            return
        if height >= len(res):
            res.append([])
        res[height].append(root.val)
        self.helper(res, root.left, height + 1)
        self.helper(res, root.right, height + 1)


class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None
