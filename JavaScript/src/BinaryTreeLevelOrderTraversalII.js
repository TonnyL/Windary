/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its bottom-up level order traversal as:
 * [
 * [15,7],
 * [9,20],
 * [3]
 * ]
 *
 * Accepted.
 */

/**
 * @param {TreeNode} root
 * @return {number[][]}
 */
let levelOrderBottom = function (root) {
    let lists = [];
    helper(lists, root, 0);
    lists = lists.reverse();
    return lists;
};

let helper = function (lists, root, height) {
    if (root === null) {
        return
    }
    if (height >= lists.length) {
        lists.push([]);
    }
    lists[height].push(root.val);
    helper(lists, root.left, height + 1);
    helper(lists, root.right, height + 1);
};

function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

if (levelOrderBottom(null).length === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

let node0 = new TreeNode(1);
if (levelOrderBottom(node0).length === 1
    && levelOrderBottom(node0)[0][0] === 1) {
    console.log("pass")
} else {
    console.error("failed")
}

let node1 = new TreeNode(3);
node1.left = new TreeNode(9);
node1.right = new TreeNode(20);
node1.right.left = new TreeNode(15);
node1.right.right = new TreeNode(7);
if (levelOrderBottom(node1).length === 3) {
    console.log("pass")
} else {
    console.error("failed")
}