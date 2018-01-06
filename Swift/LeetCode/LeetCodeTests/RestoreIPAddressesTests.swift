//
//  RestoreIPAddressesTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 06/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [RestoreIPAddresses](./LeetCode/RestoreIPAddresses.swift).
//

import XCTest
@testable import LeetCode

class RestoreIPAddressesTests: XCTestCase {
    
    func testRestoreIpAddresses() {
        let r = RestoreIPAddresses()
        
        XCTAssertTrue(r.restoreIpAddresses("1").isEmpty)
        
        XCTAssertTrue(r.restoreIpAddresses("111").isEmpty)
        
        XCTAssertTrue(r.restoreIpAddresses("1111111111111").isEmpty)
        
        XCTAssertTrue(r.restoreIpAddresses("1111") == ["1.1.1.1"])
        
        XCTAssertTrue(r.restoreIpAddresses("25525511135") == ["255.255.11.135", "255.255.111.35"])
    }
    
}
