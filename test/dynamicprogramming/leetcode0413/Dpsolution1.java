package leetcode.test.dynamicprogramming.leetcode0413;

import java.util.Arrays;

public class Dpsolution1 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        System.out.println(numberOfArithmeticSequence(nums));
    }
    public static int numberOfArithmeticSequence(int[] nums){
        int[]dp = new int[nums.length];
        Arrays.fill(dp, 0);
        for (int i = 2; i < nums.length; i ++){
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]){
                dp[i] = dp[i - 1] + 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i ++){
            sum += dp[i];
        }
        return sum;
    }
}
