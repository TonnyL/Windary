from unittest import TestCase

from AddTwoNumbers import AddTwoNumbers, ListNode


class TestAddTwoNumbers(TestCase):
    def test_addTwoNumbers(self):
        atn = AddTwoNumbers()
        node0 = ListNode(0)
        node5 = ListNode(5)
        self.assertTrue(atn.addTwoNumbers(node0, node0) == ListNode(0))
        tmp = ListNode(0)
        tmp.next = ListNode(1)
        self.assertEqual(atn.addTwoNumbers(node5, node5), tmp)

        node243 = ListNode(2)
        node243.next = ListNode(4)
        node243.next.next = ListNode(3)

        node564 = ListNode(5)
        node564.next = ListNode(6)
        node564.next.next = ListNode(4)

        tmp = ListNode(7)
        tmp.next = ListNode(0)
        tmp.next.next = ListNode(8)
        self.assertEqual(atn.addTwoNumbers(node243, node564), tmp)

        node1 = ListNode(1)
        node99 = ListNode(9)
        node99.next = ListNode(9)
        tmp = ListNode(0)
        tmp.next = ListNode(0)
        tmp.next.next = ListNode(1)
        self.assertEqual(atn.addTwoNumbers(node1, node99), tmp)
