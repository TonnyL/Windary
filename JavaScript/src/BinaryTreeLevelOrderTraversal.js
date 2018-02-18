/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its level order traversal as:
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 */

/**
 * @param {TreeNode} root
 * @return {number[][]}
 */
let levelOrder = function (root) {
    let lists = [];
    helper(lists, root, 0);
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

if (levelOrder(null).length === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

let node0 = new TreeNode(1);
if (levelOrder(node0).length === 1
    && levelOrder(node0)[0][0] === 1) {
    console.log("pass")
} else {
    console.error("failed")
}

let node1 = new TreeNode(3);
node1.left = new TreeNode(9);
node1.right = new TreeNode(20);
node1.right.left = new TreeNode(15);
node1.right.right = new TreeNode(7);
if (levelOrder(node1).length === 3) {
    console.log("pass")
} else {
    console.error("failed")
}