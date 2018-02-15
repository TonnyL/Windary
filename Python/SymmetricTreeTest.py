from unittest import TestCase

from SymmetricTree import SymmetricTree, TreeNode


class TestSymmetricTree(TestCase):
    def test_isSymmetric(self):
        st = SymmetricTree()

        self.assertTrue(st.isSymmetric(None))

        node0 = TreeNode(1)
        node0.left = TreeNode(2)
        node0.right = TreeNode(2)
        node0.left.left = TreeNode(3)
        node0.left.right = TreeNode(4)
        node0.right.left = TreeNode(4)
        node0.right.right = TreeNode(3)
        self.assertTrue(st.isSymmetric(node0))

        node1 = TreeNode(1)
        node1.left = TreeNode(2)
        node1.left.right = TreeNode(3)
        node1.right = TreeNode(2)
        node1.right.right = TreeNode(3)
        self.assertFalse(st.isSymmetric(node1))
