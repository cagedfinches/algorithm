package leetcode.test.array.leetcode0027;

public class Solution3 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int value = 3;
        int a = 0;
        a = removeElement(nums, value);
        System.out.println(a);
    }
    public static int removeElement(int[] nums, int val){
        int i = 0;
        int n = nums.length;
        while (i < n){
            if (nums[i] == val){
                nums[i] = nums[n - 1];
                n--;
            }
            else {
                i++;
            }
        }
        return n;
    }
}
