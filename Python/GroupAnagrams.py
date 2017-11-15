# -*- coding: UTF-8 -*-
#
# Given an array of strings, group anagrams together.
#
# For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
# Return:
#
# [
# ["ate", "eat","tea"],
# ["nat","tan"],
# ["bat"]
# ]
# Note: All inputs will be in lower-case.
#
# Python, Python 3 all accepted.
class GroupAnagrams:
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        m_map = {}
        for s in strs:
            chars = tuple(sorted(s))
            if m_map.get(chars) is None:
                m_map[chars] = list()
            m_map[chars].append(s)

        return list(m_map.values())


ga = GroupAnagrams()

# Expected:
# [
#   []
# ]
print(ga.groupAnagrams([]))

# Expected:
# [
#  ["ate", "eat","tea"],
#  ["nat","tan"],
#  ["bat"]
# ]
print(ga.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
