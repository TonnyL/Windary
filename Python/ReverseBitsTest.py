from unittest import TestCase

from ReverseBits import ReverseBits


class TestReverseBits(TestCase):
    def test_reverseBits(self):
        rb = ReverseBits()

        self.assertTrue(0 == rb.reverseBits(0))

        self.assertTrue(43261596 == rb.reverseBits(964176192))
