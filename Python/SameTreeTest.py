from unittest import TestCase

from SameTree import SameTree, TreeNode


class TestSameTree(TestCase):
    def test_isSameTree(self):
        st = SameTree()

        self.assertTrue(st.isSameTree(None, None))

        tn1 = TreeNode(1)
        self.assertFalse(st.isSameTree(None, tn1))
        self.assertFalse(st.isSameTree(tn1, None))

        tn2 = TreeNode(2)
        self.assertFalse(st.isSameTree(tn1, tn2))

        tn_1_1_1_1 = TreeNode(1)
        tn_1_1_1_1.left = TreeNode(1)
        tn_1_1_1_1.right = TreeNode(1)
        tn_2_1_1_1 = TreeNode(1)
        tn_2_1_1_1.left = TreeNode(1)
        tn_2_1_1_1.right = TreeNode(1)
        self.assertTrue(st.isSameTree(tn_1_1_1_1, tn_2_1_1_1))
