//
//  SubsetsTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 11/12/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//
//  Test cases for [Subsets](./LeetCode/Subsets.swift).
//

import XCTest
@testable import LeetCode

class SubsetsTests: XCTestCase {
    
    func testSubsets() {
        let s = Subsets()
        
        let array0 = s.subsets([])
        XCTAssertTrue(array0.count == 1)
        XCTAssertTrue(array0[0] == [])
        
        let array1 = s.subsets([1])
        XCTAssertTrue(array1.count == 2)
        XCTAssertTrue(array1.contains {
            $0 == []
        })
        XCTAssertTrue(array1.contains {
            $0 == [1]
        })
        
        let array2 = s.subsets([1, 2])
        XCTAssertTrue(array2.count == 4)
        XCTAssertTrue(array2.contains {
            $0 == []
        })
        XCTAssertTrue(array2.contains {
            $0 == [1]
        })
        XCTAssertTrue(array2.contains {
            $0 == [2]
        })
        XCTAssertTrue(array2.contains {
            $0 == [1, 2]
        })
        
        let array3 = s.subsets([1, 2, 3])
        XCTAssertTrue(array3.count == 8)
        XCTAssertTrue(array3.contains {
            $0 == []
        })
        XCTAssertTrue(array3.contains {
            $0 == [1]
        })
        XCTAssertTrue(array3.contains {
            $0 == [2]
        })
        XCTAssertTrue(array3.contains {
            $0 == [1, 2]
        })
        XCTAssertTrue(array3.contains {
            $0 == [3]
        })
        XCTAssertTrue(array3.contains {
            $0 == [1, 3]
        })
        XCTAssertTrue(array3.contains {
            $0 == [2, 3]
        })
        XCTAssertTrue(array3.contains {
            $0 == [1, 2, 3]
        })
    }
    
}
