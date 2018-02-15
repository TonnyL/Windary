/**
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 *
 * Accepted.
 */

function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

/**
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @return {boolean}
 */
var isSameTree = function (p, q) {
    return p === null && q === null || p !== null && q !== null && p.val === q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
};

if (isSameTree(null, null)) {
    console.log("pass")
} else {
    console.error("failed")
}

var tn1 = new TreeNode(1);
if (isSameTree(null, tn1) === false) {
    console.log("pass")
} else {
    console.error("failed")
}
if (isSameTree(tn1, null) === false) {
    console.log("pass")
} else {
    console.error("failed")
}

var tn2 = new TreeNode(2);
if (isSameTree(tn1, tn2) === false) {
    console.log("pass")
} else {
    console.error("failed")
}

var tn1111 = new TreeNode(1);
tn1111.left = new TreeNode(1);
tn1111.right = new TreeNode(1);
var tn2111 = new TreeNode(1);
tn2111.left = new TreeNode(1);
tn2111.right = new TreeNode(1);
if (isSameTree(tn1111, tn2111)) {
    console.log("pass")
} else {
    console.error("failed")
}