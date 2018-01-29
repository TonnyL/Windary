from unittest import TestCase

from LetterCombinationsOfAPhoneNumber import LetterCombinationsOfAPhoneNumber


class TestLetterCombinationsOfAPhoneNumber(TestCase):
    def test_letterCombinations(self):
        lc = LetterCombinationsOfAPhoneNumber()

        self.assertTrue(len(lc.letterCombinations("")) == 0)

        self.assertTrue(len(lc.letterCombinations("1")) == 0)

        self.assertEqual(set(lc.letterCombinations("2")), set(tuple(["a", "b", "c"])))

        self.assertEqual(set(lc.letterCombinations("23")),
                         set(tuple(["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"])))

        self.assertEqual(set(lc.letterCombinations("234")), set(tuple(
            ["adg", "adh", "adi", "aeg", "aeh", "aei", "afg", "afh", "afi", "bdg", "bdh", "bdi", "beg", "beh", "bei",
             "bfg", "bfh", "bfi", "cdg", "cdh", "cdi", "ceg", "ceh", "cei", "cfg", "cfh", "cfi"])))
