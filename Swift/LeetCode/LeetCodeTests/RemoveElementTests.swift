//
//  RemoveElementTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 25/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [RemoveElement](./LeetCode/RemoveElement.swift).
//  The solutions was accepted, but the test case reported a error. Maybe a bug.
//

import XCTest
@testable import LeetCode

class RemoveElementTests: XCTestCase {
    
    func testRemoveElement() {
        let re = RemoveElement()
        
        var array3223 = [3, 2, 2, 3]
        XCTAssertTrue(re.removeElement(&array3223, 3) == 2)
        
        var array33 = [3, 3]
        XCTAssertTrue(re.removeElement(&array33, 3) == 0)
    }
    
}
