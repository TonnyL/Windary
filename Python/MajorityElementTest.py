from unittest import TestCase

from MajorityElement import MajorityElement


class TestMajorityElement(TestCase):
    def test_majorityElement(self):
        me = MajorityElement()

        self.assertTrue(me.majorityElement([1, 1, 2]) == 1)

        self.assertTrue(me.majorityElement([0, 1, 1, 1, 2, 3, 1]) == 1)

        self.assertTrue(me.majorityElement([1, 1]) == 1)
