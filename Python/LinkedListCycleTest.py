from unittest import TestCase

from LinkedListCycle import LinkedListCycle, ListNode


class TestLinkedListCycle(TestCase):
    def test_hasCycle(self):
        llc = LinkedListCycle()

        self.assertFalse(llc.hasCycle(None))

        node0 = ListNode(0)
        node0.next = ListNode(1)
        node0.next.next = node0
        self.assertTrue(llc.hasCycle(node0))

        node1 = ListNode(0)
        node1.next = ListNode(1)
        node1.next.next = ListNode(2)
        node1.next.next.next = ListNode(0)
        self.assertFalse(llc.hasCycle(node1))
