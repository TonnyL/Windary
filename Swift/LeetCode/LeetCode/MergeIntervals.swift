//
//  MergeIntervals.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 07/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//

import Foundation

class MergeIntervals {
    
    func merge(_ intervals: [Interval]) -> [Interval] {
        if intervals.isEmpty || intervals.count == 1 {
            return intervals
        }
        
        var results = Array<Interval>.init()
        var newIntervals = intervals.sorted{ $0.start < $1.start}
        
        results.append(newIntervals[0])
        var i = 1
        while i < newIntervals.count {
            if results[results.count - 1].end >= newIntervals[i].start {
                results[results.count - 1].end = max(results[results.count - 1].end, newIntervals[i].end)
            } else {
                results.append(newIntervals[i])
            }
            
            i += 1
        }
        
        return results
    }
    
    public class Interval: CustomStringConvertible {
        public var start: Int
        public var end: Int
        public init(_ start: Int, _ end: Int) {
            self.start = start
            self.end = end
        }
        
        public var description: String {
            return "Interval start: \(self.start) end: -> \(self.end)) "
        }
    }
    
}
