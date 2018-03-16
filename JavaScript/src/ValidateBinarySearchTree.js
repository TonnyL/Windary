/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 *
 * Assume a BST is defined as follows:
 *
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * Example 1:
 * 2
 * / \
 * 1   3
 * Binary tree [2,1,3], return true.
 * Example 2:
 * 1
 * / \
 * 2   3
 * Binary tree [1,2,3], return false.
 *
 * Accepted.
 */

function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

/**
 * @param {TreeNode} root
 * @return {boolean}
 */
let isValidBST = function (root) {
    if (root === null) {
        return true;
    }

    let stack = [];
    let pre = null;
    while (root != null || stack.length !== 0) {
        while (root !== null) {
            stack.push(root);
            root = root.left;
        }
        root = stack[stack.length - 1];
        stack.splice(stack.length - 1, 1);
        if (pre != null && root.val <= pre.val) {
            return false;
        }
        pre = root;
        root = root.right;
    }

    return true;
};

if (isValidBST(null)) {
    console.log("pass")
} else {
    console.error("failed")
}

let node213 = new TreeNode(2);
node213.left = new TreeNode(1);
node213.right = new TreeNode(3);
if (isValidBST(node213)) {
    console.log("pass")
} else {
    console.error("failed")
}

if (isValidBST(new TreeNode(1))) {
    console.log("pass")
} else {
    console.error("failed")
}

let node123 = new TreeNode(1);
node123.left = new TreeNode(2);
node123.right = new TreeNode(3);
if (isValidBST(node123) === false) {
    console.log("pass")
} else {
    console.error("failed")
}

let node321 = new TreeNode(3);
node321.left = new TreeNode(2);
node321.left.left = new TreeNode(1);
if (isValidBST(node321)) {
    console.log("pass")
} else {
    console.error("failed")
}

let node10 = new TreeNode(1);
node10.right = new TreeNode(0);
if (isValidBST(node10) === false) {
    console.log("pass")
} else {
    console.error("failed")
}

let node0Minus1 = new TreeNode(0);
node0Minus1.left = new TreeNode(-1);
if (isValidBST(node0Minus1)) {
    console.log("pass")
} else {
    console.error("failed")
}