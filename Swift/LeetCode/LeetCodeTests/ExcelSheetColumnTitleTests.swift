//
//  ExcelSheetColumnTitleTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 20/03/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [ExcelSheetColumnTitle](./LeetCode/ExcelSheetColumnTitle.swift).
//

import XCTest
@testable import LeetCode

class ExcelSheetColumnTitleTests: XCTestCase {
    
    func testExample() {
        let e = ExcelSheetColumnTitle()
        
        XCTAssertEqual(e.convertToTitle(1), "A");
        
        XCTAssertEqual(e.convertToTitle(2), "B");
        
        XCTAssertEqual(e.convertToTitle(26), "Z");
        
        XCTAssertEqual(e.convertToTitle(27), "AA");
        
        XCTAssertEqual(e.convertToTitle(28), "AB");

    }
    
}
