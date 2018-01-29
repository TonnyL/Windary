from unittest import TestCase

from ValidateBinarySearchTree import ValidateBinarySearchTree, TreeNode


class TestValidateBinarySearchTree(TestCase):
    def test_isValidBST(self):
        v = ValidateBinarySearchTree()

        self.assertTrue(v.isValidBST(None))

        node213 = TreeNode(2)
        node213.left = TreeNode(1)
        node213.right = TreeNode(3)
        self.assertTrue(v.isValidBST(node213))

        self.assertTrue(v.isValidBST(TreeNode(1)))

        node123 = TreeNode(1)
        node123.left = TreeNode(2)
        node123.right = TreeNode(3)
        self.assertFalse(v.isValidBST(node123))

        node321 = TreeNode(3)
        node321.left = TreeNode(2)
        node321.left.left = TreeNode(1)
        self.assertTrue(v.isValidBST(node321))

        node10 = TreeNode(1)
        node10.right = TreeNode(0)
        self.assertFalse(v.isValidBST(node10))

        node0Minus1 = TreeNode(0)
        node0Minus1.left = TreeNode(-1)
        self.assertTrue(v.isValidBST(node0Minus1))
