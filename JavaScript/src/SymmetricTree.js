/**
 *
 * @file Symmetric Tree
 *
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 *
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 * But the following [1,2,2,null,3,null,3] is not:
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
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
let isSymmetric = function (root) {
    return isMirror(root, root);
};

let isMirror = function (node1, node2) {
    return node1 == null && node2 == null || node1 != null && node2 != null && (node1.val === node2.val) && isMirror(node1.right, node2.left) && isMirror(node1.left, node2.right);
};


if (isSymmetric(null)) {
    console.log("pass")
} else {
    console.error("failed")
}

let node0 = new TreeNode(1);
node0.left = new TreeNode(2);
node0.right = new TreeNode(2);
node0.left.left = new TreeNode(3);
node0.left.right = new TreeNode(4);
node0.right.left = new TreeNode(4);
node0.right.right = new TreeNode(3);
if (isSymmetric(node0)) {
    console.log("pass")
} else {
    console.error("failed")
}

node1 = new TreeNode(1);
node1.left = new TreeNode(2);
node1.left.right = new TreeNode(3);
node1.right = new TreeNode(2);
node1.right.right = new TreeNode(3);
if (isSymmetric(node1) === false) {
    console.log("pass")
} else {
    console.error("failed")
}