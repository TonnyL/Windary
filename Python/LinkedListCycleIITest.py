from unittest import TestCase

from LinkedListCycleII import LinkedListCycleII, ListNode


class TestLinkedListCycleII(TestCase):
    def test_detectCycle(self):
        llc = LinkedListCycleII()

        self.assertIsNone(llc.detectCycle(None))

        self.assertIsNone(llc.detectCycle(ListNode(0)))
