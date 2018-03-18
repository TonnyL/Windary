/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 *
 * For example:
 * Given binary tree [1,null,2,3],
 * 1
 * \
 * 2
 * /
 * 3
 * return [1,3,2].
 *
 * Note: Recursive solution is trivial, could you do it iteratively?
 */

function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;

    this.equals = function (node) {
        if (this.val !== node.val) {
            return false;
        }
        if (this.left == null) {
            if (this.right == null) {
                return node.left == null && node.right == null;
            }
            return this.right.equals(node.right);
        }
        if (this.right == null) {
            return node.right == null;
        }
        return this.left.equals(node.left) && this.right.equals(node.right);
    };
}

/**
 * Iterative solution.
 *
 * @param {TreeNode} root
 * @return {number[]}
 */
let inorderTraversal = function (root) {
    let list = [];
    if (root == null) {
        return list;
    }

    let stack = [];
    while (root != null || stack.length !== 0) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }

        root = stack[stack.length - 1];
        stack.splice(stack.length - 1);
        list.push(root.val);
        root = root.right;
    }

    return list;
};

/**
 * Recursive solution.
 *
 * @param {TreeNode} root
 * @return {number[]}
 */
/*let inorderTraversal = function (root) {
    let list = [];
    if (root == null) {
        return list;
    }
    if (root.left != null) {
        inorderTraversal(root.left).forEach(function (i) {
            list.push(i);
        });
    }
    list.push(root.val);
    if (root.right != null) {
        inorderTraversal(root.right).forEach(function (i) {
            list.push(i);
        });
    }
    return list;
};*/


if (inorderTraversal(null).length === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

let node132 = new TreeNode(1);
let right = new TreeNode(2);
right.left = new TreeNode(3);
node132.right = right;

let list132 = [1, 3, 2];
if (inorderTraversal(node132).toString() === list132.toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let node4251637 = new TreeNode(1);
let node2 = new TreeNode(2);
let node3 = new TreeNode(3);
node2.left = new TreeNode(4);
node2.right = new TreeNode(5);
node3.left = new TreeNode(6);
node3.right = new TreeNode(7);
node4251637.left = node2;
node4251637.right = node3;

let list4251637 = [4, 2, 5, 1, 6, 3, 7];
if (inorderTraversal(node4251637).toString() === list4251637.toString()) {
    console.log("pass")
} else {
    console.error("failed")
}