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


v = ValidateBinarySearchTree()

# Expected: True
print(v.isValidBST(None))

node213 = TreeNode(2)
node213.left = TreeNode(1)
node213.right = TreeNode(3)
# Expected: True
print(v.isValidBST(node213))

# Expected: True
print(v.isValidBST(TreeNode(1)))

node123 = TreeNode(1)
node123.left = TreeNode(2)
node123.right = TreeNode(3)
# Expected: False
print(v.isValidBST(node123))

node321 = TreeNode(3)
node321.left = TreeNode(2)
node321.left.left = TreeNode(1)
# Expected: True
print(v.isValidBST(node321))

node10 = TreeNode(1)
node10.right = TreeNode(0)
# Expected: False
print(v.isValidBST(node10))

node0Minus1 = TreeNode(0)
node0Minus1.left = TreeNode(-1)
# Expected: True
print(v.isValidBST(node0Minus1))
