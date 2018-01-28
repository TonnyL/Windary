/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Note: Given n will be a positive integer.
 * <p>
 * Accepted. Recursion will exceed the time limit.
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return n;
        }

        int[] results = new int[n];
        results[0] = 1;
        results[1] = 2;

        for (int i = 2; i < n; i++) {
            results[i] = results[i - 1] + results[i - 2];
        }

        return results[n - 1];
    }

}
