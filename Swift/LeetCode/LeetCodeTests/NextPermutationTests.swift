//
//  NextPermutationTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 23/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [NextPermutation](./LeetCode/NextPermutation.swift).
//

import XCTest
@testable import LeetCode

class NextPermutationTests: XCTestCase {
    
    func testNextPermutation() {
        let np = NextPermutation()
        
        // Expected: [1, 3, 2]
        var array123 = [1, 2, 3]
        np.nextPermutation(&array123)
        XCTAssertTrue(array123 == [1, 3, 2])
        
        // Expected: [1, 2, 3]
        var array321 = [3, 2, 1]
        np.nextPermutation(&array321)
        XCTAssertTrue(array321 == [1, 2, 3])
        
        // Expected: [1, 5, 1]
        var array115 = [1, 1, 5]
        np.nextPermutation(&array115)
        XCTAssertTrue(array115 == [1, 5, 1])
    }
    
}
