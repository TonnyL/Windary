# Given a binary tree, determine if it is a valid binary search tree (BST).
#
# Assume a BST is defined as follows:
#
# The left subtree of a node contains only nodes with keys less than the node's key.
# The right subtree of a node contains only nodes with keys greater than the node's key.
# Both the left and right subtrees must also be binary search trees.
# Example 1:
# 2
# / \
# 1   3
# Binary tree [2,1,3], return True.
# Example 2:
# 1
# / \
# 2   3
# Binary tree [1,2,3], return False.
#
# Python, Python3 all accepted.


class ValidateBinarySearchTree:
    def isValidBST(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if root is None:
            return True
        stack = Stack()
        pre = None
        while root is not None or stack.size() != 0:
            while root is not None:
                stack.push(root)
                root = root.left
            root = stack.pop()
            if pre is not None and root.val <= pre.val:
                return False
            pre = root
            root = root.right

        return True


class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Stack:
    def __init__(self):
        self.items = []

    def isEmpty(self):
        return self.items == []

    def push(self, item):
        self.items.insert(0, item)

    def pop(self):
        return self.items.pop(0)

    def peek(self):
        return self.items[0]

    def size(self):
        return len(self.items)
