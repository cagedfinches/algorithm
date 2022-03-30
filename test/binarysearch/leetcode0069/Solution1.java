package leetcode.test.binarysearch.leetcode0069;
import java.io.*;
import java.util.*;

public class Solution1 {
    public static void main(String[] args){
        int x = 2147395599;
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        int left = 0;
        int right = x;
        int mid;
        while (left < right - 1) {
            mid = left + (right - left) / 2;
            //long long mid2 = mid * mid;
            if ((long)mid * mid >= x) {
                right = mid;
            } else if ((long)mid * mid < x) {
                left = mid;
            }
        }
        if ((right * right) == x) {
            return right;
        } else {
            return left;
        }
    }
}



