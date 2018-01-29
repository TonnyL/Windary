from unittest import TestCase

from SwapNodesInPairs import SwapNodesInPairs, ListNode


class TestSwapNodesInPairs(TestCase):
    def test_swapPairs(self):
        s = SwapNodesInPairs()

        self.assertIsNone(s.swapPairs(None))

        tmp = ListNode(1)
        self.assertEqual(s.swapPairs(ListNode(1)), tmp)

        node12 = ListNode(1)
        node12.next = ListNode(2)
        tmp = ListNode(2)
        tmp.next = ListNode(1)
        self.assertEqual(s.swapPairs(node12), tmp)

        node1234 = ListNode(1)
        node1234.next = ListNode(2)
        node1234.next.next = ListNode(3)
        node1234.next.next.next = ListNode(4)
        tmp.next.next = ListNode(4)
        tmp.next.next.next = ListNode(3)
        self.assertEqual(s.swapPairs(node1234), tmp)

        node12345 = ListNode(1)
        node12345.next = ListNode(2)
        node12345.next.next = ListNode(3)
        node12345.next.next.next = ListNode(4)
        node12345.next.next.next.next = ListNode(5)
        tmp.next.next.next.next = ListNode(5)
        self.assertEqual(s.swapPairs(node12345), tmp)
