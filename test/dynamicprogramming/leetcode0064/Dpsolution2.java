package leetcode.test.dynamicprogramming.leetcode0064;

public class Dpsolution2 {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{1,2,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));

    }
    public static int minPathSum(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int[] dp = new int[n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 && j == 0){
                    dp[j] = grid[i][j];
                }
                if(i == 0 && j != 0){
                    dp[j] = dp[j - 1] + grid[i][j];
                }
                if(j == 0 && i != 0){
                    dp[j] = dp[j] + grid[i][j];
                }
                if(i != 0 && j != 0){
                    dp[j] = Math.min(dp[j], dp[j - 1]) + grid[i][j];
                }
            }
        }
        return dp[n - 1];
    }
}
