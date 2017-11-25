//
//  SqrtX.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 24/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//
//  Implement int sqrt(int x).
//
//  Compute and return the square root of x.
//
//  x is guaranteed to be a non-negative integer.
//
//  Accepted. See [SqrtXTests](./LeetCodeTests/SqrtXTest.swift) for the test cases.
//

import Foundation

class SqrtX {

    func mySqrt(_ x: Int) -> Int {
        if x <= 0 {
            return 0
        }
        if x <= 3 {
            return 1
        }

        var high = x / 2, low = 1
        if x >= (46340 * 46340) {
            return 46340
        }
        if high > 46340 {
            high = 46340
        }

        var mid = (high + 1) / 2
        repeat {
            if (mid * mid) > x {
                high = (mid - 1)
            } else if (mid * mid) < x {
                if ((mid + 1) * (mid + 1)) > x {
                    return mid;
                }
                low = (mid + 1)
            } else {
                return mid
            }
            mid = ((low + high) / 2)
        } while (high > low)

        return mid
    }

}
