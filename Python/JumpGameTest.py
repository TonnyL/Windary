from unittest import TestCase

from JumpGame import JumpGame


class TestJumpGame(TestCase):
    def test_canJump(self):
        jg = JumpGame()

        self.assertFalse(jg.canJump([]))

        self.assertTrue(jg.canJump([1]))

        self.assertTrue(jg.canJump([0]))

        self.assertTrue(jg.canJump([2, 3, 1, 1, 4]))

        self.assertFalse(jg.canJump([3, 2, 1, 0, 4]))

        self.assertTrue(jg.canJump([4, 0, 0, 0]))
