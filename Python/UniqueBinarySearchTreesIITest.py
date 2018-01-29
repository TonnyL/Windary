from unittest import TestCase

from UniqueBinarySearchTreesII import UniqueBinarySearchTreesII, TreeNode


class TestUniqueBinarySearchTreesII(TestCase):
    def test_generateTrees(self):
        u = UniqueBinarySearchTreesII()

        self.assertTrue(len(u.generateTrees(0)) == 0)

        self.assertEqual(u.generateTrees(1), [TreeNode(1)])

        node0 = TreeNode(2)
        node0.left = TreeNode(1)
        node1 = TreeNode(1)
        node1.right = TreeNode(2)
        array0 = u.generateTrees(2)
        self.assertTrue(len(array0) == 2)
        self.assertTrue(array0.__contains__(node0))
        self.assertTrue(array0.__contains__(node1))

        # Expected:
        # 1       3     3      2      1
        # \      /     /      / \      \
        # 3     2     1      1  3      2
        # /    /       \                \
        # 2   1        2                 3
        node2 = TreeNode(1)
        node2.right = TreeNode(3)
        node2.right.left = TreeNode(2)
        node3 = TreeNode(3)
        node3.left = TreeNode(2)
        node3.left.left = TreeNode(1)
        node4 = TreeNode(3)
        node4.left = TreeNode(1)
        node4.left.right = TreeNode(2)
        node5 = TreeNode(2)
        node5.left = TreeNode(1)
        node5.right = TreeNode(3)
        node6 = TreeNode(1)
        node6.right = TreeNode(2)
        node6.right.right = TreeNode(3)
        array1 = u.generateTrees(3)
        self.assertTrue(len(array1) == 5)
        self.assertTrue(array1.__contains__(node2))
        self.assertTrue(array1.__contains__(node3))
        self.assertTrue(array1.__contains__(node4))
        self.assertTrue(array1.__contains__(node5))
        self.assertTrue(array1.__contains__(node6))
