/**
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 * <p>
 * Example 1:
 * <p>
 * Input: "Hello"
 * Output: "hello"
 * Example 2:
 * <p>
 * Input: "here"
 * Output: "here"
 * Example 3:
 * <p>
 * Input: "LOVELY"
 * Output: "lovely"
 * <p>
 * Accepted.
 */

/**
 * @param {string} str
 * @return {string}
 */
let toLowerCase = function (str) {
    // return str.toLowerCase()
    let builder = "";
    for (let index = 0; index < str.length; index++) {
        let asciiValue = str.charCodeAt(index);
        if (asciiValue >= 65 && asciiValue <= 90) {
            builder += String.fromCharCode(asciiValue + 32);
        } else {
            builder += str.charAt(index)
        }
    }

    return builder;
};

if (toLowerCase("Hello") === "hello") {
    console.log("pass");
} else {
    console.error("failed");
}

if (toLowerCase("here") === "here") {
    console.log("pass");
} else {
    console.error("failed");
}

if (toLowerCase("LOVELY") === "lovely") {
    console.log("pass");
} else {
    console.error("failed");
}