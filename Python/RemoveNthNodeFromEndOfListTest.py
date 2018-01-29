from unittest import TestCase

from RemoveNthNodeFromEndOfList import RemoveNthNodeFromEndOfList, ListNode


class TestRemoveNthNodeFromEndOfList(TestCase):
    def test_removeNthFromEnd(self):
        r = RemoveNthNodeFromEndOfList()

        node12345 = ListNode(1)
        node12345.next = ListNode(2)
        node12345.next.next = ListNode(3)
        node12345.next.next.next = ListNode(4)
        node12345.next.next.next.next = ListNode(5)
        tmp = ListNode(1)
        tmp.next = ListNode(2)
        tmp.next.next = ListNode(3)
        tmp.next.next.next = ListNode(5)
        self.assertEqual(r.removeNthFromEnd(node12345, 2), tmp)

        node12 = ListNode(1)
        node12.next = ListNode(2)
        tmp = ListNode(1)
        self.assertEqual(r.removeNthFromEnd(node12, 1), tmp)

        self.assertIsNone(r.removeNthFromEnd(ListNode(1), 1))

        self.assertIsNone(r.removeNthFromEnd(None, 2))

        node123: ListNode = ListNode(1)
        node123.next = ListNode(2)
        node123.next.next = ListNode(3)
        tmp = ListNode(2)
        tmp.next = ListNode(3)
        node123 = r.removeNthFromEnd(node123, 3)
        self.assertEqual(node123, tmp)
        tmp = ListNode(2)
        self.assertEqual(r.removeNthFromEnd(node123, 1), tmp)
        self.assertIsNone(r.removeNthFromEnd(node123, 1))
