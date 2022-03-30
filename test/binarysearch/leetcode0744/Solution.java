package leetcode.test.binarysearch.leetcode0744;
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        char[] a = {'c', 'f', 'j'};
        char t = 'a';
        System.out.println(nextGreatestLetter(a, t));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1, mid;
        while (left < right - 1) {
            mid = left + (right - left) / 2;
            if (target >= letters[mid]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        if (letters[left] > target) {
            return letters[left];
        }
        else if(letters[right] > target) {
            return letters[right];
        }
        else{
            return letters[0];
        }
    }
}
