package leetcode.test.dynamicprogramming.leetcode0198;

public class Dpsolution {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,9,3,1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums){
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return nums[0];
        }
        int pre = 0;
        int cur = nums[0];
        for(int i = 2; i <= n; i++){
            int temp = cur;
            cur = Math.max(nums[i - 1] + pre, cur);
            pre = temp;
        }
        return cur;
    }
}
