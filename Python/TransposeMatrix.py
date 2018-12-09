#
# Given a matrix A, return the transpose of A.
#
# The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.
#
# Example 1:
#
# Input: [[1,2,3],[4,5,6],[7,8,9]]
# Output: [[1,4,7],[2,5,8],[3,6,9]]
# Example 2:
#
# Input: [[1,2,3],[4,5,6]]
# Output: [[1,4],[2,5],[3,6]]
#
# Note:
#
# 1 <= A.length <= 1000
# 1 <= A[0].length <= 1000
#
# Python, Python3 all accepted.

class TransposeMatrix(object):
    def transpose(self, A):
        """
        :type A: List[List[int]]
        :rtype: List[List[int]]
        """
        a_length = len(A)
        a0_length = len(A[0])
        tmp = [[0 for x in range(0, a_length)] for x in range(0, a0_length)]
        for i in range(0, a0_length):
            for j in range(0, a_length):
                tmp[i][j] = A[j][i]

        return tmp
