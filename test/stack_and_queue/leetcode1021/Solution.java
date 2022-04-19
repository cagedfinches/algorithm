package leetcode.test.stack_and_queue.leetcode1021;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
    public static String removeOuterParentheses(String s) {
        Deque<Character> deque = new ArrayDeque<Character>();
        int n = s.length();
        int count_l = 0;
        int count_r = 0;
        String d = "";
        for (int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if (ch == '('){
                deque.offerLast(ch);
                count_l ++;
            }
            else{
                deque.offerLast(ch);
                count_r ++;
            }
            if (count_l == count_r){
                deque.pollLast();
                deque.pollFirst();
                count_l = 0;
                count_r = 0;
                while (!deque.isEmpty()){
                    d = d + deque.pollFirst();
                }
            }
        }
        //String d = "";
        while (!deque.isEmpty()){
            d = d + deque.pollFirst();
        }
        return d;
    }
}
