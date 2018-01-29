from unittest import TestCase

from RemoveElement import RemoveElement


class TestRemoveElement(TestCase):
    def test_removeElement(self):
        re = RemoveElement()

        # nums: [2, 2, 3, 3] length = 2
        self.assertTrue(re.removeElement([3, 2, 2, 3], 3) == 2)

        # nums: [3, 3] length = 0
        self.assertTrue(re.removeElement([3, 3], 3) == 0)
