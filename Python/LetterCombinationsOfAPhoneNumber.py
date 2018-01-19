# Given a digit string, return all possible letter combinations that the number could represent.
#
# A mapping of digit to letters (just like on the telephone buttons) is given below.
#
# Input:Digit string "23"
# Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
# Note:
# Although the above answer is in lexicographical order, your answer could be in any order you want.
#
# Python, Python3 all accepted.
class LetterCombinationsOfAPhoneNumber:
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        t = (" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz")
        results = []

        digits_length = len(digits)
        if digits_length == 0:
            return results

        if digits_length == 1:
            for c in t[int(digits)]:
                results.append(str(c))
            return results

        li = self.letterCombinations(str(digits[1:digits_length]))
        builder = ""

        for c in t[int(str(digits[0:1]))]:
            for s in li:
                builder += str(c)
                builder += s
                results.append(builder)
                builder = ""

        return results


lc = LetterCombinationsOfAPhoneNumber()
# Expected: []
print(lc.letterCombinations(""))

# Expected: [""]
print(lc.letterCombinations("1"))

# Expected: ["a", "b", "c"]
print(lc.letterCombinations("2"))

# Expected: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
print(lc.letterCombinations("23"))

# Expected: ["adg", "adh", "adi", "aeg", "aeh", "aei",
# "afg", "afh", "afi", "bdg", "bdh", "bdi", "beg", "beh",
# "bei", "bfg", "bfh", "bfi", "cdg", "cdh", "cdi", "ceg",
# "ceh", "cei", "cfg", "cfh", "cfi"]
print(lc.letterCombinations("234"))
