package leetcode.test.array.leetcode0026;

public class Solution1 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        int a = 0;
        a = removeDuplicates(nums);
        System.out.println(a);
    }
    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++){
                if (nums[j] == nums[i]){

                    for(int k = j; k < len; k++){
                        if(k + 1 < len) {
                            nums[k] = nums[k + 1];
                        }
                    }
                    len = len - 1;
                    j--;
                }
                else {
                    break;
                }
            }
        }
        return len;
    }
}
