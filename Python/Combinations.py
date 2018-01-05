# Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
# <p>
# For example,
# If n = 4 and k = 2, a solution is:
# <p>
# [
# [2,4],
# [3,4],
# [2,3],
# [1,2],
# [1,3],
# [1,4],
# ]
class Combinations:
    # Iterative solution.
    # Python, Python3 all accepted.
    def combine(self, n, k):
        """
        :param n:
        :param k:
        :return:
        """
        results = []
        if n == 0 or k == 0 or k > n:
            return results

        for i in range(1, n + 1 - k + 1):
            results.append([i])

        for i in range(2, k + 1):
            tmp = []
            for l in results:
                for m in range(l[len(l) - 1] + 1, n - (k - i) + 1):
                    newList = []
                    newList.extend(l)
                    newList.append(m)
                    tmp.append(newList)
            results = tmp

        return results

    # Recursive solution.
    # Python2 Time Limit Exceeded. Python3 accepted.
    # def combine(self, n, k):
    #     """
    #     :type n: int
    #     :type k: int
    #     :rtype: List[List[int]]
    #     """
    #     results = []
    #     if n == 0 or k == 0 or k > n:
    #         return results
    #
    #     if k == 1:
    #         for i in range(1, n + 1):
    #             results.append([i])
    #         return results
    #
    #     for l in self.combine(n, k - 1):
    #         for i in range(l[len(l) - 1], n):
    #             tmp = []
    #             tmp.extend(l)
    #             tmp.append(i + 1)
    #             results.append(tmp)
    #
    #     return results


c = Combinations()

print(c.combine(2, 0))

print(c.combine(2, 1))

print(c.combine(4, 2))

print(c.combine(4, 3))
