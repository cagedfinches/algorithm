package leetcode.test.String.laicode0397;
import java.util.*;
public class Solution {
    public static void main(String[] argument){
        String s = new String("abcd");
        int n = 2;
        System.out.println((new Solution()).rightShift(s,n));
    }
    public String rightShift(String s, int n){
        char[] array = s.toCharArray();
        char[] newarray = new char[s.length()];
        for (int i = 0; i < s.length(); i++){
            int index = (i + n % s.length()) % s.length();
            newarray[index] = array[i];
        }
        return new String(newarray);
    }
}
