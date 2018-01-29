from unittest import TestCase

from BinaryTreeInorderTraversal import BinaryTreeInorderTraversal

from BinaryTreeInorderTraversal import TreeNode


class TestBinaryTreeInorderTraversal(TestCase):
    def test_inorderTraversal(self):
        b = BinaryTreeInorderTraversal()

        self.assertTrue(len(b.inorderTraversal(None)) == 0)

        node132 = TreeNode(1)
        right = TreeNode(2)
        right.left = TreeNode(3)
        node132.right = right

        self.assertEqual(b.inorderTraversal(node132), [1, 3, 2])

        node4251637 = TreeNode(1)
        node2 = TreeNode(2)
        node3 = TreeNode(3)
        node2.left = TreeNode(4)
        node2.right = TreeNode(5)
        node3.left = TreeNode(6)
        node3.right = TreeNode(7)
        node4251637.left = node2
        node4251637.right = node3

        self.assertEqual(b.inorderTraversal(node4251637), [4, 2, 5, 1, 6, 3, 7])
