from unittest import TestCase

from IntersectionOfTwoLinkedLists import IntersectionOfTwoLinkedLists, ListNode


class TestIntersectionOfTwoLinkedLists(TestCase):
    def test_getIntersectionNode(self):
        i = IntersectionOfTwoLinkedLists()

        self.assertIsNone(i.getIntersectionNode(None, None))

        node345 = ListNode(3)
        node345.next = ListNode(4)
        node345.next.next = ListNode(5)

        self.assertIsNone(i.getIntersectionNode(node345, ListNode(6)))

        node12345 = ListNode(1)
        node12345.next = ListNode(2)
        node12345.next.next = node345

        self.assertEqual(i.getIntersectionNode(node12345, node345), node345)
