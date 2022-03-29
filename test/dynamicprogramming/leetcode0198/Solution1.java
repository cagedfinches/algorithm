package leetcode.test.dynamicprogramming.leetcode0198;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,9,3,1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums){
        int[] map = new int[nums.length];
        Arrays.fill(map, -1);
        return robhouse(nums, nums.length, map);
    }
    public static int robhouse(int[] num, int n, int[] map){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return num[0];
        }
        if (map[n - 1] != -1){
            return map[n - 1];
        }
        int res = Math.max(robhouse(num, n-1, map), robhouse(num,n - 2, map) + num[n - 1]);
        map[n - 1] = res;
        return res;
    }
}
