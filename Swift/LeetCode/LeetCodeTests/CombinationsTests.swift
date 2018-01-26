//
//  CombinationsTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 05/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [Combinations](./LeetCode/Combinations.swift).
//

import XCTest
@testable import LeetCode

class CombinationsTests: XCTestCase {
    
    func testCombine() {
        let c = Combinations()
        
        XCTAssertTrue(c.combine(2, 0).isEmpty)
        
        let array0 = c.combine(2, 1)
        XCTAssertTrue(array0.count == 2)
        XCTAssertTrue(array0.contains {
            $0 == [1]
        })
        XCTAssertTrue(array0.contains {
            $0 == [2]
        })
        
        let array1 = c.combine(4, 2)
        XCTAssertTrue(array1.count == 6)
        XCTAssertTrue(array1.contains {
            $0 == [2, 4]
        })
        XCTAssertTrue(array1.contains {
            $0 == [3, 4]
        })
        XCTAssertTrue(array1.contains {
            $0 == [2, 3]
        })
        XCTAssertTrue(array1.contains {
            $0 == [1, 2]
        })
        XCTAssertTrue(array1.contains {
            $0 == [1, 3]
        })
        XCTAssertTrue(array1.contains {
            $0 == [1, 4]
        })
        
        let array2 = c.combine(4, 3)
        XCTAssertTrue(array2.count == 4)
        XCTAssertTrue(array2.contains {
            $0 == [1, 2, 3]
        })
        XCTAssertTrue(array2.contains {
            $0 == [1, 2, 4]
        })
        XCTAssertTrue(array2.contains {
            $0 == [1, 3, 4]
        })
        XCTAssertTrue(array2.contains {
            $0 == [2, 3, 4]
        })
    }
    
}
