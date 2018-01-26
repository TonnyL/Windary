//
//  PermutationsTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 05/12/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [Permutations](./LeetCode/Permutations.swift).
//

import XCTest
@testable import LeetCode

class PermutationsTests: XCTestCase {
    
    func testPermute() {
        let p = Permutations()
        
        XCTAssertTrue(p.permute([]).isEmpty)
        
        // Expected: [[1]]
        let array0 = p.permute([1])
        XCTAssertTrue(array0.count == 1)
        XCTAssertTrue(array0[0] == [1])
        
        let array1 = p.permute([1, 2])
        XCTAssertTrue(array1.count == 2)
        XCTAssertTrue(array1.contains {
            $0 == [1, 2]
        })
        XCTAssertTrue(array1.contains {
            $0 == [2, 1]
        })
        
        let array2 = p.permute([1, 2, 3])
        XCTAssertTrue(array2.count == 6)
        XCTAssertTrue(array2.contains {
            $0 == [1, 2, 3]
        })
        XCTAssertTrue(array2.contains {
            $0 == [1, 3, 2]
        })
        XCTAssertTrue(array2.contains {
            $0 == [2, 1, 3]
        })
        XCTAssertTrue(array2.contains {
            $0 == [2, 3, 1]
        })
        XCTAssertTrue(array2.contains {
            $0 == [3, 1, 2]
        })
        XCTAssertTrue(array2.contains {
            $0 == [3, 2, 1]
        })
    }

}
