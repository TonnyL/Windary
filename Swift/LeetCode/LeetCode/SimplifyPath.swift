//
//  SimplifyPath.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 24/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given an absolute path for a file (Unix-style), simplify it.
//
//  For example,
//  path = "/home/", => "/home"
//  path = "/a/./b/../../c/", => "/c"
//
//  Corner Cases:
//  Did you consider the case where path = "/../"?
//  In this case, you should return "/".
//  Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
//  In this case, you should ignore redundant slashes and return "/home/foo".
//
//  Accepted. See the [SimplifyPathTests](./LeetCodeTests/SimplifyPath.swift) for test cases.
//

import Foundation

class SimplifyPath {

    func simplifyPath(_ path: String) -> String {
        if path.isEmpty {
            return path
        }

        let strings = path.components(separatedBy: "/")
        var results = [String]()
        for s in strings {
            if s == ".." {
                if !results.isEmpty {
                    results.remove(at: results.count - 1)
                }
            } else if (s != ".") && !(s.isEmpty) {
                results.append(s)
            }
        }

        if results.isEmpty {
            return "/"
        }

        var s = ""
        for i in 0...(results.count - 1) {
            s.append("/")
            s.append(results[i])
        }

        return s
    }

}
