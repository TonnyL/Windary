function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

/**
 * @param {TreeNode} root
 * @return {number}
 */
let maxDepth = function (root) {
    let max = 0;
    if (root !== null) {
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
    return max;
};

if (maxDepth(null) === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

let node0 = new TreeNode(3);
node0.left = new TreeNode(9);
node0.right = new TreeNode(20);
node0.right.left = new TreeNode(15);
node0.right.right = new TreeNode(7);
if (maxDepth(node0) === 3) {
    console.log("pass")
} else {
    console.error("failed")
}

let node1 = new TreeNode(1);
node1.left = new TreeNode(2);
node1.left.left = new TreeNode(3);
node1.left.left.left = new TreeNode(4);
if (maxDepth(node1) === 4) {
    console.log("pass")
} else {
    console.error("failed")
}