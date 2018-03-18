/**
 * Given an absolute path for a file (Unix-style), simplify it.
 *
 * For example,
 * path = "/home/", => "/home"
 * path = "/a/./b/../../c/", => "/c"
 *
 * Corner Cases:
 * Did you consider the case where path = "/../"?
 * In this case, you should return "/".
 * Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
 * In this case, you should ignore redundant slashes and return "/home/foo".
 *
 * Accepted.
 */


/**
 * @param {string} path
 * @return {string}
 */
let simplifyPath = function (path) {
    if (path == null || path.length === 0) {
        return path;
    }

    let strings = path.split('/');
    let stack = [];
    for (let i = 1; i < strings.length; i++) {
        if (strings[i] === "..") {
            if (stack.length !== 0) {
                stack.splice(stack.length - 1);
            }
        } else if (strings[i] !== "." && strings[i].length !== 0) {
            stack.push(strings[i]);
        }
    }

    let builder = "";
    stack.forEach(function (s) {
        builder = builder.concat("/", s);
    });

    return builder.length === 0 ? "/" : builder;
};


if (simplifyPath("/home/") === "/home") {
    console.log("pass")
} else {
    console.error("failed")
}

if (simplifyPath("/a/./b/../../c/") === "/c") {
    console.log("pass")
} else {
    console.error("failed")
}

if (simplifyPath("/../") === "/") {
    console.log("pass")
} else {
    console.error("failed")
}

if (simplifyPath("/home//foo/") === "/home/foo") {
    console.log("pass")
} else {
    console.error("failed")
}

if (simplifyPath("/a/b/c") === "/a/b/c") {
    console.log("pass")
} else {
    console.error("failed")
}