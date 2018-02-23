# Given an index k, return the kth row of the Pascal's triangle.
#
# For example, given k = 3,
# Return [1,3,3,1].
#
# Note:
# Could you optimize your algorithm to use only O(k) extra space?
#
# Python, Python3 all accepted.


class PascalsTriangleII:
    def getRow(self, rowIndex):
        """
        :type rowIndex: int
        :rtype: List[int]
        """
        results = [1]

        if rowIndex == 0:
            return results

        for i in range(rowIndex):
            results.append(1)
            for j in range(len(results) - 2, 0, -1):
                results[j] = results[j - 1] + results[j]

        return results
