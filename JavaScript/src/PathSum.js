/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 *
 * For example:
 * Given the below binary tree and sum = 22,
 *
 * 5
 * / \
 * 4  8
 * /  / \
 * 11 13 4
 * /  \   \
 * 7  2   1
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 *
 * Accepted.
 */

function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

/**
 * @param {TreeNode} root
 * @param {number} sum
 * @return {boolean}
 */
let hasPathSum = function (root, sum) {
    return root != null && (root.left == null && root.right == null && sum === root.val || hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val));
};

if (!hasPathSum(null, 1)) {
    console.log("pass")
} else {
    console.error("failed")
}

if (hasPathSum(new TreeNode(1), 1)) {
    console.log("pass")
} else {
    console.error("failed")
}

let node = new TreeNode(5);
node.left = new TreeNode(4);
node.right = new TreeNode(8);
node.left.left = new TreeNode(11);
node.left.left.left = new TreeNode(7);
node.left.left.right = new TreeNode(2);
node.right = new TreeNode(8);
node.right.left = new TreeNode(13);
node.right.right = new TreeNode(4);
node.right.right.right = new TreeNode(1);

if (hasPathSum(node, 22)) {
    console.log("pass")
} else {
    console.error("failed")
}