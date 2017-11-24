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

        // Expected: "/home"
        XCTAssertTrue(sp.simplifyPath("/home/") == "/home")

        // Expected: "/c"
        XCTAssertTrue(sp.simplifyPath("/a/./b/../../c/") == "/c")

        // Expected: "/"
        XCTAssertTrue(sp.simplifyPath("/../") == "/")

        // Expected: "/home/foo"
        XCTAssertTrue(sp.simplifyPath("/home//foo/") == "/home/foo")

        // Expected: "/a/b/c"
        XCTAssertTrue(sp.simplifyPath("/a/b/c") == "/a/b/c")
    }

}
