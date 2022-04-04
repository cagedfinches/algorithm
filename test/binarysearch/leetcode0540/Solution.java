package leetcode.test.binarysearch.leetcode0540;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(singleNonDuplicate(arr));
    }
    public static int singleNonDuplicate(int[] nums) {
        if (nums == null || nums.length == 0){
            return -1;
        }
        if (nums.length == 1){
            return nums[0];
        }
        int left = 0, right = nums.length - 1, mid, ans = -1;
        while(left < right){
            mid = left + (right - left) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]){
                return nums[mid];
            }
            else if (nums[mid] == nums[mid - 1]){
                if (mid % 2 == 1){
                    ans = right;
                    left = mid;
                }
                else if (mid % 2 == 0){
                    right = mid;
                }
            }
            else if (nums[mid] == nums[mid + 1]){
                if (mid % 2 == 0){
                    left = mid;
                }
                else if (mid % 2 == 1){
                    right = mid;
                }
            }

            else {
                return nums[ans];
            }


        }
        return -1;
    }
}
