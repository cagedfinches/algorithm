package leetcode.test.array.leetcode0026;

public class Solution2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        int a = 0;
        a = removeDuplicates(nums);
        System.out.println(a);
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int i = 0;
        for(int j = 1; j < nums.length; j ++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
