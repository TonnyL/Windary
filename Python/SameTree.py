# -*- coding: UTF-8 -*-
# Given two binary trees, write a function to check if they are equal or not.
#
# Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
#
# Python, Python 3 all accepted.
class SameTree(object):
    def isSameTree(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        if p is None and q is None:
            return True
        if p is None or q is None:
            return False

        while True:
            return p.val == q.val and self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)


# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


st = SameTree()
# Expected: True
print(st.isSameTree(None, None))

tn1 = TreeNode(1)
# Expected: False
print(st.isSameTree(None, tn1))
# Expected: False
print(st.isSameTree(tn1, None))

tn2 = TreeNode(2)
# Expected: False
print(st.isSameTree(tn1, tn2))

tn_1_1_1_1 = TreeNode(1)
tn_1_1_1_1.left = TreeNode(1)
tn_1_1_1_1.right = TreeNode(1)
tn_2_1_1_1 = TreeNode(1)
tn_2_1_1_1.left = TreeNode(1)
tn_2_1_1_1.right = TreeNode(1)
# Expected: True
print(st.isSameTree(tn_1_1_1_1, tn_2_1_1_1))
