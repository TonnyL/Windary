from unittest import TestCase

from BinaryTreeLevelOrderTraversalII import BinaryTreeLevelOrderTraversalII, TreeNode


class TestBinaryTreeLevelOrderTraversalII(TestCase):
    def test_levelOrderBottom(self):
        b = BinaryTreeLevelOrderTraversalII()

        self.assertTrue(len(b.levelOrderBottom(None)) == 0)

        node0 = TreeNode(1)
        self.assertEqual(b.levelOrderBottom(node0), [[1]])

        node1 = TreeNode(3)
        node1.left = TreeNode(9)
        node1.right = TreeNode(20)
        node1.right.left = TreeNode(15)
        node1.right.right = TreeNode(7)

        self.assertEqual(b.levelOrderBottom(node1), [[15, 7], [9, 20], [3]])
