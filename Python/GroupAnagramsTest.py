from unittest import TestCase

from GroupAnagrams import GroupAnagrams


class TestGroupAnagrams(TestCase):
    def test_groupAnagrams(self):
        ga = GroupAnagrams()

        self.assertTrue(len(ga.groupAnagrams([])) == 0)

        list0 = ga.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"])
        self.assertTrue(len(list0) == 3)
        self.assertTrue(list0.__contains__(["tan", "nat"]))
        self.assertTrue(list0.__contains__(["eat", "tea", "ate"]))
        self.assertTrue(list0.__contains__(["bat"]))
