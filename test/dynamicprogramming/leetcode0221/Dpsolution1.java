package leetcode.test.dynamicprogramming.leetcode0221;

import java.util.Arrays;

public class Dpsolution1 {
    public static void main(String[] args) {
        char[][] matrix = new char[][]{{'0','1','1','1'},{'1','1','1','1'},{'1','1','1','1'},{'1','1','1','1'}};
        System.out.println(maximalSquare(matrix));
    }
    public static int maximalSquare(char[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int maxside = 0;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], 0);
        }
        for(int i = 1; i <= m; i++){
            for (int j = 1; j <= n; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                }
                maxside = Math.max(dp[i][j], maxside);
            }
        }
        return maxside * maxside;
    }
}
