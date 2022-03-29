package leetcode.test.array.leetcode0027;

public class Solution1 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int value = 3;
        int a = 0;
        a = removeElement(nums, value);
        System.out.println(a);
    }
    public static int removeElement(int[] nums, int val){
        int i = 0;
        while(i < nums.length){
            if(nums[i] == val) {
                int j = 0;
                for (j = i + 1; j < nums.length; j++) {
                   int temp = 0;
                   if(nums[j] != val){
                       temp = nums[i];
                       nums[i] = nums[j];
                       nums[j] = temp;
                       i++;
                       break;
                   }
                }
                if (j == nums.length && nums[j - 1] == val){
                    return i;
                }
            }
            else {
                i++;
            }
        }
        return i;
    }

}
