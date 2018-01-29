from unittest import TestCase

from LongestSubstringWithoutRepeatingCharacters import LongestSubstringWithoutRepeatingCharacters


class TestLongestSubstringWithoutRepeatingCharacters(TestCase):
    def test_lengthOfLongestSubstring(self):
        lswrc = LongestSubstringWithoutRepeatingCharacters()
        # Expected: wke, 3
        self.assertTrue(lswrc.lengthOfLongestSubstring("pwwkew") == 3)
        # Expected: b, 1
        self.assertTrue(lswrc.lengthOfLongestSubstring("bbbbb") == 1)
        # Expected: abc, 3
        self.assertTrue(lswrc.lengthOfLongestSubstring("abcabcbb") == 3)
        # Expected: vdf, 3
        self.assertTrue(lswrc.lengthOfLongestSubstring("dvdf") == 3)
