//
//  PermutationsIITests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 05/12/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [PermutationsII](./LeetCode/PermutationsII.swift).
//

import XCTest
@testable import LeetCode

class PermutationsIITests: XCTestCase {
    
    func testPermuteUnique() {
        let p = PermutationsII()
        
        XCTAssertTrue(p.permuteUnique([]).isEmpty)
        
        let array1 = p.permuteUnique([1])
        XCTAssertTrue(array1.count == 1)
        XCTAssertTrue(array1[0] == [1])
        
        let array2 = p.permuteUnique([1, 1, 2])
        XCTAssertTrue(array2.count == 3)
        XCTAssertTrue(array2.contains {
            $0 == [1, 1, 2]
        })
        XCTAssertTrue(array2.contains {
            $0 == [1, 2, 1]
        })
        XCTAssertTrue(array2.contains {
            $0 == [2, 1, 1]
        })
    }
    
}
