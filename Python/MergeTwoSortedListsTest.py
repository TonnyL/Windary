from unittest import TestCase

from MergeTwoSortedLists import MergeTwoSortedLists, ListNode


class TestMergeTwoSortedLists(TestCase):
    def test_mergeTwoLists(self):
        m = MergeTwoSortedLists()

        n1 = ListNode(1)
        n1.next = ListNode(2)
        n1.next.next = ListNode(4)

        n2 = ListNode(1)
        n2.next = ListNode(3)
        n2.next.next = ListNode(4)

        tmp = ListNode(1)
        tmp.next = ListNode(1)
        tmp.next.next = ListNode(2)
        tmp.next.next.next = ListNode(3)
        tmp.next.next.next.next = ListNode(4)
        tmp.next.next.next.next.next = ListNode(4)
        self.assertEqual(m.mergeTwoLists(n1, n2), tmp)

        tmp = ListNode(1)
        tmp.next = ListNode(2)
        tmp.next.next = ListNode(4)
        self.assertEqual(m.mergeTwoLists(n1, None), tmp)

        tmp = ListNode(1)
        tmp.next = ListNode(3)
        tmp.next.next = ListNode(4)
        self.assertEqual(m.mergeTwoLists(None, n2), tmp)

        self.assertIsNone(m.mergeTwoLists(None, None))
