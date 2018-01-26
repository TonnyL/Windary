//
//  Created by 黎赵太郎 on 24/11/2017.
//  Copyright (c) 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [SimplifyPath](./LeetCode/Simplify.swift).
//

import XCTest
@testable import LeetCode

class SimplifyPathTest: XCTestCase {

    func testSimplifyPath() {
        let sp = SimplifyPath()

        XCTAssertTrue(sp.simplifyPath("/home/") == "/home")

        XCTAssertTrue(sp.simplifyPath("/a/./b/../../c/") == "/c")

        XCTAssertTrue(sp.simplifyPath("/../") == "/")

        XCTAssertTrue(sp.simplifyPath("/home//foo/") == "/home/foo")

        XCTAssertTrue(sp.simplifyPath("/a/b/c") == "/a/b/c")
    }

}
