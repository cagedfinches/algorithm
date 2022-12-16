package leetcode.test.DFS.leetcode0494;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,1,1};
        int target = 3;
        //findTargetSumWays(nums, target);
        System.out.println((new Solution()).findTargetSumWays(nums, target));
    }
    public int findTargetSumWays(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        dfs(nums, target, 0, res);
        int sum = 0;
        for (Integer i : res){
            sum = sum + i;
        }
        return sum;
    }
    public void dfs(int[] nums, int target, int index, List<Integer> res){
        if (index == nums.length){
            if (target == 0){
                res.add(1);
            }
            return;
        }
        dfs(nums, target - nums[index], index + 1, res);
        //nums[index] = nums[index]*(-1);
        dfs(nums, target + nums[index], index + 1, res);
        //nums[index] = nums[index]*(-1);
    }
}
