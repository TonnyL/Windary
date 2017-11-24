//
//  SimplifyPath.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 24/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
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
