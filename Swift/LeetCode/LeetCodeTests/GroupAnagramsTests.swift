//
//  GroupAnagramsTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [GroupAnagrams](./LeetCode/GroupAnagrams.swift).
//

import XCTest
@testable import LeetCode

class GroupAnagramsTests: XCTestCase {
    
    func testGroupAnagrams() {
        let ga = GroupAnagrams()
        
        let r0 = ga.groupAnagrams([])
        XCTAssertTrue(r0.isEmpty)
        
        let r1 = ga.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"])
        XCTAssertTrue(r1.count == 3)
        XCTAssertTrue(r1[0] == ["tan", "nat"])
        XCTAssertTrue(r1[1] == ["eat", "tea", "ate"])
        XCTAssertTrue(r1[2] == ["bat"])
    }
    
}
