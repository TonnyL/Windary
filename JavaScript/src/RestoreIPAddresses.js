/**
 * Given a string containing only digits, restore it by returning all possible valid IP address combinations.
 *
 * For example:
 * Given "25525511135",
 *
 * return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
 *
 * Accepted.
 */

/**
 * @param {string} s
 * @return {string[]}
 */
var restoreIpAddresses = function (s) {
    var results = [];
    if (s === null || s.length < 4 || s.length > 12) {
        return results
    }

    for (var i = 1; i < 4; i++) {
        for (var j = 1; j < 4; j++) {
            for (var k = 1; k < 4; k++) {
                for (var m = 1; m < 4; m++) {
                    if (i + j + k + m === s.length) {
                        var a = parseInt(s.substring(0, i));
                        var b = parseInt(s.substring(i, j + i));
                        var c = parseInt(s.substring(i + j, k + i + j));
                        var d = parseInt(s.substring(i + j + k, m + i + j + k));
                        if (a <= 255 && b <= 255 && c <= 255 && d <= 255) {
                            var str = a.toString() + "." + b + "." + c + "." + d;
                            if (str.length === s.length + 3) {
                                results.push(str);
                            }
                        }
                    }
                }
            }
        }
    }

    return results
};

if (restoreIpAddresses("1").length === 0) {
    console.log("pass")
} else {
    console.error("failed")
}


if (restoreIpAddresses("111").length === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

if (restoreIpAddresses("1111111111111").length === 0) {
    console.log("pass")
} else {
    console.error("failed")
}


if (restoreIpAddresses("1111").toString() === ["1.1.1.1"].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (restoreIpAddresses("25525511135").toString() === ["255.255.11.135", "255.255.111.35"].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}