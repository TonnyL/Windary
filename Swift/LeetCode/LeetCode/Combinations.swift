//
//  Combinations.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 05/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
//
//  For example,
//  If n = 4 and k = 2, a solution is:
//
//  [
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//  ]
//
//  See [CombinationsTests](./LeetCodeTests/CombinationsTests.swift) for test cases.
//

import Foundation

class Combinations {
    
//    Recursive Solution.
//    Accepted.
//    func combine(_ n: Int, _ k: Int) -> [[Int]] {
//        var results = Array<Array<Int>>.init()
//        if n == 0 || k == 0 || k > n {
//            return results
//        }
//
//        if k == 1 {
//            var i = 1
//            while i <= n {
//                results.append([i])
//
//                i += 1
//            }
//
//            return results
//        }
//
//        for list in combine(n, k - 1) {
//            var i = list[list.count - 1]
//            while i < n {
//                var tmp = Array<Int>.init()
//                tmp.append(contentsOf: list)
//                tmp.append(i + 1)
//                results.append(tmp)
//
//                i += 1
//            }
//        }
//
//        return results
//    }
    
//    Iterative Solution.
//    Accepted.
    func combine(_ n: Int, _ k: Int) -> [[Int]] {
        var results = Array<Array<Int>>.init()
        if n == 0 || k == 0 || k > n {
            return results
        }

        var i = 1
        while i <= n + 1 - k {
            results.append([i])

            i += 1
        }

        i = 2
        while i <= k {
            var tmp = Array<Array<Int>>.init()
            for list in results {
                var m = list[list.count - 1] + 1
                while m <= n - (k - i) {
                    var newList = Array<Int>.init()
                    newList.append(contentsOf: list)
                    newList.append(m)
                    tmp.append(newList)

                    m += 1
                }
            }
            results = tmp

            i += 1
        }

        return results
    }
    
}
