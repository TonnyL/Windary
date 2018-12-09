# Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
# <p>
# Example 1:
# <p>
# Input: "Hello"
# Output: "hello"
# Example 2:
# <p>
# Input: "here"
# Output: "here"
# Example 3:
# <p>
# Input: "LOVELY"
# Output: "lovely"
# <p>
# Python, Python3 all accepted.


class ToLowerCase(object):
    def toLowerCase(self, str):
        """
        :type str: str
        :rtype: str
        """
        # return str.lower()
        str_array = list(str)
        result = ""
        for ch in str_array:
            ascii_value = ord(ch)
            if 65 <= ascii_value <= 90:
                result += chr(ascii_value + 32)
            else:
                result += ch

        return result
