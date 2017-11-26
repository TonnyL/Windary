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
        
        // Expected: []
        print(ga.groupAnagrams([]))
        
        // Expected: [["tan", "nat"], ["eat", "tea", "ate"], ["bat"]]
        print(ga.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
    }
    
}
