from unittest import TestCase

from RemoveDuplicatesFromSortedListII import RemoveDuplicatesFromSortedListII, ListNode


class TestRemoveDuplicatesFromSortedListII(TestCase):
    def test_deleteDuplicates(self):
        r = RemoveDuplicatesFromSortedListII()

        node1233445 = ListNode(1)
        node1233445.next = ListNode(2)
        node1233445.next.next = ListNode(3)
        node1233445.next.next.next = ListNode(3)
        node1233445.next.next.next.next = ListNode(4)
        node1233445.next.next.next.next.next = ListNode(4)
        node1233445.next.next.next.next.next.next = ListNode(5)
        tmp = ListNode(1)
        tmp.next = ListNode(2)
        tmp.next.next = ListNode(5)
        self.assertEqual(r.deleteDuplicates(node1233445), tmp)

        node11123 = ListNode(1)
        node11123.next = ListNode(1)
        node11123.next.next = ListNode(1)
        node11123.next.next.next = ListNode(2)
        node11123.next.next.next.next = ListNode(3)
        tmp = ListNode(2)
        tmp.next = ListNode(3)
        self.assertEqual(r.deleteDuplicates(node11123), tmp)

        node111 = ListNode(1)
        node111.next = ListNode(1)
        node111.next.next = ListNode(1)
        self.assertIsNone(r.deleteDuplicates(node111))

        self.assertIsNone(r.deleteDuplicates(None))

        node122 = ListNode(1)
        node122.next = ListNode(2)
        node122.next.next = ListNode(2)
        tmp = ListNode(1)
        self.assertEqual(r.deleteDuplicates(node122), tmp)

        node11 = ListNode(1)
        node11.next = ListNode(1)
        self.assertIsNone(r.deleteDuplicates(node11))

        node1122 = ListNode(1)
        node1122.next = ListNode(1)
        node1122.next.next = ListNode(2)
        node1122.next.next.next = ListNode(2)
        self.assertIsNone(r.deleteDuplicates(node1122))
