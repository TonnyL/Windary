from unittest import TestCase

from SortList import SortList, ListNode


class TestSortList(TestCase):
    def test_sortList(self):
        sl = SortList()

        self.assertIsNone(sl.sortList(None))

        self.assertEqual(ListNode(0), sl.sortList(ListNode(0)))

        node1 = ListNode(1)
        node1.next = ListNode(0)

        node2 = ListNode(0)
        node2.next = ListNode(1)

        self.assertEqual(node2, sl.sortList(node1))

        node3 = ListNode(0)
        node3.next = ListNode(1)

        self.assertEqual(node3, sl.sortList(node2))
