//
//  SortColorsTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 27/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [SortColors](./LeetCode/SortColors.swift).
//

import XCTest
@testable import LeetCode

class SortColorsTests: XCTestCase {
    
    func testSortColors() {
        let sc = SortColors()
        
        var array0: [Int] = []
        sc.sortColors(&array0)
        XCTAssertTrue(array0 == [])
        
        var array1 = [0]
        sc.sortColors(&array1)
        XCTAssertTrue(array1 == [0])
        
        var array2 = [2, 1, 0]
        sc.sortColors(&array2)
        XCTAssertTrue(array2 == [0, 1, 2])
        
        var array3 = [0, 1, 0, 1, 1, 1, 2, 0, 1]
        sc.sortColors(&array3)
        XCTAssertTrue(array3 == [0, 0, 0, 1, 1, 1, 1, 1, 2])
        
        var array4 = [0, 1, 2, 0, 1]
        sc.sortColors(&array4)
        XCTAssertTrue(array4 == [0, 0, 1, 1, 2])
        
        var array5 = [2, 2, 2, 2, 1, 0, 2, 0, 1]
        sc.sortColors(&array5)
        XCTAssertTrue(array5 == [0, 0, 1, 1, 2, 2, 2, 2, 2])
        
        var array6 = [0, 0, 1, 1, 1, 2, 2, 2]
        sc.sortColors(&array6)
        XCTAssertTrue(array6 == [0, 0, 1, 1, 1, 2, 2, 2])
        
        var array7 = [0, 0, 0, 2, 2, 2, 1, 1, 1]
        sc.sortColors(&array7)
        XCTAssertTrue(array7 == [0, 0, 0, 1, 1, 1, 2, 2, 2])
    }
    
}
