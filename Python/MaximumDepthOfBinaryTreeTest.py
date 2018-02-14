from unittest import TestCase

from MaximumDepthOfBinaryTree import MaximumDepthOfBinaryTree, TreeNode


class TestMaximumDepthOfBinaryTree(TestCase):
    def test_maxDepth(self):
        m = MaximumDepthOfBinaryTree()

        self.assertTrue(m.maxDepth(None) == 0)

        node0 = TreeNode(3)
        node0.left = TreeNode(9)
        node0.right = TreeNode(20)
        node0.right.left = TreeNode(15)
        node0.right.right = TreeNode(7)
        self.assertTrue(m.maxDepth(node0) == 3)

        node1 = TreeNode(1)
        node1.left = TreeNode(2)
        node1.left.left = TreeNode(3)
        node1.left.left.left = TreeNode(4)
        self.assertTrue(m.maxDepth(node1) == 4)
