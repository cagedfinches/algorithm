package leetcode.test.dynamicprogramming.leetcode0279;

import java.util.Arrays;

public class Dpsolution {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(numSquares(n));
    }
    public static int numSquares(int n){
        int[]dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE / 2);
        dp[0] = 0;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j * j <= i; j++){
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }
}
