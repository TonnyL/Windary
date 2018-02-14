# Given numRows, generate the first numRows of Pascal's triangle.
#
# For example, given numRows = 5,
# Return
#
# [
# [1],
# [1,1],
# [1,2,1],
# [1,3,3,1],
# [1,4,6,4,1]
# ]
#
# Python, Python3 all accepted.


class PascalsTriangle:
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        results = []
        if numRows == 0:
            return results
        if numRows == 1:
            results.append([1])
            return results
        if numRows == 2:
            results.append([1])
            results.append([1, 1])
            return results
        tmp = self.generate(numRows - 1)
        tmp_list = []

        last = tmp[len(tmp) - 1]
        tmp_list.append(1)
        for i in range(1, len(last)):
            tmp_list.append(last[i - 1] + last[i])
        tmp_list.append(1)
        tmp.append(tmp_list)

        return tmp
