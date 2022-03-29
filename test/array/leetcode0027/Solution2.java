package leetcode.test.array.leetcode0027;

public class Solution2 {
    public static void main(String[] args) {
    int[] nums = new int[]{3,2,2,3};
    int value = 3;
    int a = 0;
    a = removeElement(nums, value);
    System.out.println(a);
}
    public static int removeElement(int[] nums, int val){
        int fast = 0;
        int slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        return slow;
    }


}
