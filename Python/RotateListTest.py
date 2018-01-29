from unittest import TestCase

from RotateList import RotateList, ListNode


class TestRotateList(TestCase):
    def test_rotateRight(self):
        rl = RotateList()

        self.assertIsNone(rl.rotateRight(None, 1))

        # Expected: 1
        tmp = ListNode(1)
        self.assertEqual(rl.rotateRight(ListNode(1), 1), tmp)

        # Expected: 1 -> 2
        node12 = ListNode(1)
        node12.next = ListNode(2)
        tmp.next = ListNode(2)
        self.assertEqual(rl.rotateRight(node12, 0), tmp)

        # Expected: 3 -> 1 -> 2
        node123 = ListNode(1)
        node123.next = ListNode(2)
        node123.next.next = ListNode(3)
        tmp = ListNode(3)
        tmp.next = ListNode(1)
        tmp.next.next = ListNode(2)
        self.assertEqual(rl.rotateRight(node123, 1), tmp)

        node12345 = ListNode(1)
        node12345.next = ListNode(2)
        node12345.next.next = ListNode(3)
        node12345.next.next.next = ListNode(4)
        node12345.next.next.next.next = ListNode(5)
        tmp = ListNode(4)
        tmp.next = ListNode(5)
        tmp.next.next = ListNode(1)
        tmp.next.next.next = ListNode(2)
        tmp.next.next.next.next = ListNode(3)
        self.assertEqual(rl.rotateRight(node12345, 2), tmp)
