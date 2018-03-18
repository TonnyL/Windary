/**
 * Given an array of strings, group anagrams together.
 *
 * For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Return:
 *
 * [
 * ["ate", "eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 * Note: All inputs will be in lower-case.
 *
 * Accepted.
 */


/**
 * @param {string[]} strs
 * @return {string[][]}
 */
let groupAnagrams = function (strs) {
    let results = [];

    if (strs.length === 0) {
        return results;
    }

    let map = new Map();
    strs.forEach(function (s) {
        let chars = s.split('');
        chars.sort();
        let key = chars.join('');
        if (map.get(key) == null) {
            map.set(key, []);
        }
        map.get(key).push(s);
    });

    map.forEach(function (value, key, map) {
        results.push(value);
    });
    return results;
};


if (groupAnagrams([]).length === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

let list0 = groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]);
let set = new Set([["ate", "eat", "tea"], ["nat", "tan"], ["bat"]]);
if (list0.length === 3) {
    console.log("pass")
} else {
    console.error("failed")
}
if (new Set(list0).toString() === set.toString()) {
    console.log("pass")
} else {
    console.error("failed")
}