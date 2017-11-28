import java.util.ArrayList;
import java.util.List;

/**
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 * <p>
 * For example,
 * Given n = 3, there are a total of 5 unique BST's.
 * <p>
 * 1        3     3      2      1
 * \       /     /      / \      \
 * 3      2     1      1   3      2
 * /     /      \                 \
 * 2    1       2                 3
 * <p>
 * Accepted.
 */
public class UniqueBinarySearchTrees {

    // Recursive solution. Time limit exceeded.
    /*public int numTrees(int n) {
        if (n == 0 || n == 1) return 1;

        int r = 0;
        for (int i = 1; i <= n; i++) {
            r = r + numTrees(i - 1) * numTrees(n - i);
        }

        return r;
    }*/

    // Dynamic programming.
    public int numTrees(int n) {
        int[] array = new int[n + 2];
        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                array[i] += array[j] * array[i - j - 1];
            }
        }

        return array[n];
    }

    public static void main(String[] args) {
        UniqueBinarySearchTrees u = new UniqueBinarySearchTrees();

        // Expected: 1
        System.out.println(u.numTrees(0));

        // Expected: 1
        System.out.println(u.numTrees(1));

        // Expected: 2
        System.out.println(u.numTrees(2));

        // Expected: 5
        System.out.println(u.numTrees(3));

        // Expected: 14
        System.out.println(u.numTrees(4));
    }

}
