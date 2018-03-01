from unittest import TestCase

from InsertionSortList import InsertionSortList, ListNode


class TestInsertionSortList(TestCase):
    def test_insertionSortList(self):
        ist = InsertionSortList()

        self.assertIsNone(ist.insertionSortList(None))

        self.assertEqual(ist.insertionSortList(ListNode(0)), ListNode(0))

        node0 = ListNode(1)
        node0.next = ListNode(0)
        node1 = ListNode(0)
        node1.next = ListNode(1)
        self.assertEqual(ist.insertionSortList(node0), node1)
