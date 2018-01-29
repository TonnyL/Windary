from unittest import TestCase

from WordSearch import WordSearch


class TestWordSearch(TestCase):
    def test_search(self):
        ws = WordSearch()

        self.assertFalse(ws.exist([[]], "AB"))

        chars = [['A', 'B', 'C', 'E'], ['S', 'F', 'C', 'S'], ['A', 'D', 'E', 'E']]

        self.assertTrue(ws.exist(chars, "ABCCED"))

        self.assertTrue(ws.exist(chars, "SEE"))

        self.assertFalse(ws.exist(chars, "ABCB"))
