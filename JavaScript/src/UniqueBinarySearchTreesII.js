/**
 * Given an integer n, generate all structurally unique BST's (binary search trees) that store values 1...n.
 * <p>
 * For example,
 * Given n = 3, your program should return all 5 unique BST's shown below.
 * <p>
 * 1       3     3      2      1
 * \      /     /      / \      \
 * 3     2     1      1  3      2
 * /    /       \                \
 * 2   1        2                 3
 * <p>
 * Accepted.
 */

function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

/**
 * @param {number} n
 * @return {TreeNode[]}
 */
var generateTrees = function (n) {
    var list = [];
    if (n <= 0) {
        return list;
    }

    return gen(1, n);
};

var gen = function (start, end) {
    var list = [];
    if (start > end) {
        list.push(null);
        return list;
    }
    if (start === end) {
        list.push(new TreeNode(start));
        return list;
    }

    for (var i = start; i <= end; i++) {
        gen(start, i - 1).forEach(function (m) {
            gen(i + 1, end).forEach(function (n) {
                var root = new TreeNode(i);
                root.left = m;
                root.right = n;
                list.push(root);
            })
        });
    }

    return list;
};

if (generateTrees(0).length === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

var node0 = new TreeNode(1);
if (generateTrees(1).toString() === [node0].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

// Expected:
// 2  1
// /   \
//1    2
var list0 = generateTrees(2);
node1 = new TreeNode(2);
node1.left = new TreeNode(1);
node2 = new TreeNode(1);
node2.right = new TreeNode(2);
if (list0.length === 2) {
    console.log("pass")
} else {
    console.error("failed")
}

// Expected:
// 1       3     3      2      1
// \      /     /      / \      \
// 3     2     1      1  3      2
///    /       \                \
//2   1        2                 3
var node3 = new TreeNode(1);
node3.right = new TreeNode(3);
node3.right.left = new TreeNode(2);
var node4 = new TreeNode(3);
node4.left = new TreeNode(2);
node4.left.left = new TreeNode(1);
var node5 = new TreeNode(3);
node5.left = new TreeNode(1);
node5.left.right = new TreeNode(2);
var node6 = new TreeNode(2);
node6.left = new TreeNode(1);
node6.right = new TreeNode(3);
var node7 = new TreeNode(1);
node7.right = new TreeNode(2);
node7.right.right = new TreeNode(3);
var list1 = generateTrees(3);
if (list1.length === 5) {
    console.log("pass")
} else {
    console.error("failed")
}
