from unittest import TestCase

from PathSum import PathSum, TreeNode


class TestPathSum(TestCase):
    def test_hasPathSum(self):
        ps = PathSum()

        self.assertFalse(ps.hasPathSum(None, 1))

        self.assertTrue(ps.hasPathSum(TreeNode(1), 1))

        node = TreeNode(5)
        node.left = TreeNode(4)
        node.right = TreeNode(8)
        node.left.left = TreeNode(11)
        node.left.left.left = TreeNode(7)
        node.left.left.right = TreeNode(2)
        node.right = TreeNode(8)
        node.right.left = TreeNode(13)
        node.right.right = TreeNode(4)
        node.right.right.right = TreeNode(1)

        self.assertTrue(ps.hasPathSum(node, 22))
