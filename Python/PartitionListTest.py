from unittest import TestCase

from PartitionList import PartitionList, ListNode


class TestPartitionList(TestCase):
    def test_partition(self):
        pl = PartitionList()

        self.assertIsNone(pl.partition(None, 2))

        node12 = ListNode(1)
        node12.next = ListNode(2)
        tmp = ListNode(1)
        tmp.next = ListNode(2)
        self.assertEqual(pl.partition(node12, 3), tmp)
        self.assertEqual(pl.partition(node12, 0), tmp)

        node143252 = ListNode(1)
        node143252.next = ListNode(4)
        node143252.next.next = ListNode(3)
        node143252.next.next.next = ListNode(2)
        node143252.next.next.next.next = ListNode(5)
        node143252.next.next.next.next.next = ListNode(2)
        tmp.next.next = ListNode(2)
        tmp.next.next.next = ListNode(4)
        tmp.next.next.next.next = ListNode(3)
        tmp.next.next.next.next.next = ListNode(5)
        self.assertEqual(pl.partition(node143252, 3), tmp)

        tmp = ListNode(1)
        tmp.next = ListNode(3)
        tmp.next.next = ListNode(2)
        tmp.next.next.next = ListNode(2)
        tmp.next.next.next.next = ListNode(4)
        tmp.next.next.next.next.next = ListNode(5)
        self.assertEqual(pl.partition(node143252, 4), tmp)
