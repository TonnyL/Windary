from unittest import TestCase

from RemoveDuplicatesFromSortedList import RemoveDuplicatesFromSortedList, ListNode


class TestRemoveDuplicatesFromSortedList(TestCase):
    def test_deleteDuplicates(self):
        r = RemoveDuplicatesFromSortedList()

        self.assertIsNone(r.deleteDuplicates(None))

        node112 = ListNode(1)
        node112.next = ListNode(1)
        node112.next.next = ListNode(2)
        tmp = ListNode(1)
        tmp.next = ListNode(2)
        self.assertEqual(r.deleteDuplicates(node112), tmp)

        node11233 = ListNode(1)
        node11233.next = ListNode(1)
        node11233.next.next = ListNode(2)
        node11233.next.next.next = ListNode(3)
        node11233.next.next.next.next = ListNode(3)
        tmp.next.next = ListNode(3)
        self.assertEqual(r.deleteDuplicates(node11233), tmp)

        node111 = ListNode(1)
        node111.next = ListNode(1)
        node111.next.next = ListNode(1)
        tmp = ListNode(1)
        self.assertEqual(r.deleteDuplicates(node111), tmp)

        node1222 = ListNode(1)
        node1222.next = ListNode(2)
        node1222.next.next = ListNode(2)
        node1222.next.next.next = ListNode(2)
        tmp.next = ListNode(2)
        self.assertEqual(r.deleteDuplicates(node1222), tmp)

        node1122 = ListNode(1)
        node1122.next = ListNode(1)
        node1122.next.next = ListNode(2)
        node1122.next.next.next = ListNode(2)
        self.assertEqual(r.deleteDuplicates(node1122), tmp)
