//
//  SubsetsIITests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 08/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [SubsetsII](./LeetCode/SubsetsII.swift).
//

import XCTest
@testable import LeetCode

class SubsetsIITests: XCTestCase {
    
    func testSubsetsWithDup() {
        let s = SubsetsII()
        
        XCTAssertTrue(s.subsetsWithDup([]).isEmpty)
        
        let array0 = s.subsetsWithDup([1])
        XCTAssertTrue(array0.count == 2)
        XCTAssertTrue(array0.contains {
            $0 == [1]
        })
        XCTAssertTrue(array0.contains {
            $0 == []
        })
        
        let array1 = s.subsetsWithDup([1, 1])
        XCTAssertTrue(array1.count == 3)
        XCTAssertTrue(array1.contains {
            $0 == []
        })
        XCTAssertTrue(array1.contains {
            $0 == [1]
        })
        XCTAssertTrue(array1.contains {
            $0 == [1, 1]
        })
        
        let array2 = s.subsetsWithDup([1, 2])
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
            $0 == [2, 1]
        })
        
        let array3 = s.subsetsWithDup([1, 2, 2])
        XCTAssertTrue(array3.count == 6)
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
            $0 == [2, 2, 1]
        })
        XCTAssertTrue(array3.contains {
            $0 == [2, 2]
        })
        XCTAssertTrue(array3.contains {
            $0 == [2, 1]
        })
        
        let array4 = s.subsetsWithDup([4, 4, 4, 1, 4])
        XCTAssertTrue(array4.count == 10)
        XCTAssertTrue(array4.contains {
            $0 == []
        })
        XCTAssertTrue(array4.contains {
            $0 == [1]
        })
        XCTAssertTrue(array4.contains {
            $0 == [4, 1]
        })
        XCTAssertTrue(array4.contains {
            $0 == [4, 4, 1]
        })
        XCTAssertTrue(array4.contains {
            $0 == [4, 4, 4, 1]
        })
        XCTAssertTrue(array4.contains {
            $0 == [4, 4, 4, 4, 1]
        })
        XCTAssertTrue(array4.contains {
            $0 == [4]
        })
        XCTAssertTrue(array4.contains {
            $0 == [4, 4]
        })
        XCTAssertTrue(array4.contains {
            $0 == [4, 4, 4]
        })
        XCTAssertTrue(array4.contains {
            $0 == [4, 4, 4, 4]
        })
    }
    
}
