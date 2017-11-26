//
//  PowXN.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Implement pow(x, n).
//
//  Accepted. See [PowXNTests](./LeetCodeTests/PowXNTests.swift) for test cases.
//

import Foundation

class PowXN {
    
    func myPow(_ x: Double, _ n: Int) -> Double {
        // return pow(x, Double(n))
        if n == 0 {
            return 1
        }
        if n == 1 {
            return x
        }
        
        let result = myPow(x, n / 2)
        if (n % 2) == 0 {
            return result * result
        } else if n > 0 {
            return x * result * result
        }
        
        return (result * result) / x
    }
    
}
