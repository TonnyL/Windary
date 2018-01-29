from unittest import TestCase

from ReverseLinkedListII import ReverseLinkedListII, ListNode


class TestReverseLinkedListII(TestCase):
    def test_reverseBetween(self):
        r = ReverseLinkedListII()

        self.assertIsNone(r.reverseBetween(None, 1, 2))

        node123 = ListNode(1)
        node123.next = ListNode(2)
        node123.next.next = ListNode(3)
        tmp = ListNode(1)
        tmp.next = ListNode(3)
        tmp.next.next = ListNode(2)
        self.assertEqual(r.reverseBetween(node123, 2, 3), tmp)

        tmp = ListNode(1)
        self.assertEqual(r.reverseBetween(ListNode(1), 1, 1), tmp)

        node12 = ListNode(1)
        node12.next = ListNode(2)
        tmp = ListNode(2)
        tmp.next = ListNode(1)
        self.assertEqual(r.reverseBetween(node12, 1, 2), tmp)

        node12345 = ListNode(1)
        node12345.next = ListNode(2)
        node12345.next.next = ListNode(3)
        node12345.next.next.next = ListNode(4)
        node12345.next.next.next.next = ListNode(5)
        tmp = ListNode(1)
        tmp.next = ListNode(4)
        tmp.next.next = ListNode(3)
        tmp.next.next.next = ListNode(2)
        tmp.next.next.next.next = ListNode(5)
        self.assertEqual(r.reverseBetween(node12345, 2, 4), tmp)
