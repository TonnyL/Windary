from unittest import TestCase

from BinaryTreeLevelOrderTraversal import BinaryTreeLevelOrderTraversal, TreeNode


class TestBinaryTreeLevelOrderTraversal(TestCase):
    def test_levelOrder(self):
        b = BinaryTreeLevelOrderTraversal()

        self.assertTrue(len(b.levelOrder(None)) == 0)

        node0 = TreeNode(1)
        self.assertEqual(b.levelOrder(node0), [[1]])

        node1 = TreeNode(3)
        node1.left = TreeNode(9)
        node1.right = TreeNode(20)
        node1.right.left = TreeNode(15)
        node1.right.right = TreeNode(7)

        self.assertEqual(b.levelOrder(node1), [[3], [9, 20], [15, 7]])
