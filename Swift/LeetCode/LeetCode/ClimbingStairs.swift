//
//  Created by 黎赵太郎 on 24/11/2017.
//  Copyright (c) 2017 lizhaotailang. All rights reserved.
//
//  You are climbing a stair case. It takes n steps to reach to the top.
//
//  Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//
//  Note: Given n will be a positive integer.
//
//  Accepted. See the [ClimbingStairsTests](../LeetCodeTest/ClimbingStairsTests.swift)
//  for test cases.
//

import Foundation

class ClimbingStairs {

    func climbStairs(_ n: Int) -> Int {
        if n <= 0 {
            return 0
        }
        if n == 1 {
            return 1
        }
        if n == 2 {
            return 2
        }

        var results = [Int](repeating: 0, count: n)
        results[0] = 1
        results[1] = 2

        for i in 2...(n - 1) {
            results[i] = results[i - 1] + results[i - 2]
        }

        return results[n - 1]
    }

}
