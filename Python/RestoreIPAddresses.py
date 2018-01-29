# Given a string containing only digits, restore it by returning all possible valid IP address combinations.
#
# For example:
# Given "25525511135",
#
# return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
#
# Python, Python3 all accepted.


class RestoreIPAddresses:
    def restoreIpAddresses(self, s):
        """
        :type s: str
        :rtype: List[str]
        """
        length = len(s)
        results = []
        if length < 4 or length > 12:
            return results

        for i in range(1, 4):
            for j in range(1, 4):
                for k in range(1, 4):
                    for m in range(1, 4):
                        if i + j + k + m == length:
                            a = int(s[0:i])
                            b = int(s[i:j + i])
                            c = int(s[i + j:k + i + j])
                            d = int(s[i + j + k:m + i + j + k])
                            if a <= 255 and b <= 255 and c <= 255 and d <= 255:
                                string = "" + str(a) + "." + str(b) + "." + str(c) + "." + str(d)
                                if len(string) == length + 3:
                                    results.append(string)

        return results
