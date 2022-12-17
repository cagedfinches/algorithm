package leetcode.test.DFS.laicode0179;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        //System.out.println((Arrays.toString((new Solution()).validParentheses(2, 2, 2).toArray())));
        List<String> ans = new ArrayList<>();
        ans = (new Solution()).validParentheses(2,2,2);
        System.out.println(Arrays.toString(ans.toArray()));
    }
    public List<String> validParentheses(int l, int m, int n){
        List<String> res = new ArrayList<>();
        int sum = 2 * (l + m + n);
        char[] array = new char[]{'(', ')', '<', '>', '{', '}'};
        int[] num = new int[]{l, l, m, m, n, n};
        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder subres = new StringBuilder();
        dfs(sum, array, num, stack, subres, res);
        return res;
    }
    public void dfs(int sum, char[] array, int[] num, Deque<Integer> stack, StringBuilder subres, List<String> res){
        if (subres.length() == sum){
            res.add(subres.toString());
            return;
        }
        for (int i = 0; i < array.length; i++){
            if (i % 2 == 0){
                if (num[i] > 0 && (stack.isEmpty() || stack.peekFirst() > i)){
                    stack.offerFirst(i);
                    subres.append(array[i]);
                    num[i]--;
                    dfs(sum, array, num, stack, subres, res);
                    num[i]++;
                    subres.deleteCharAt(subres.length() - 1);
                    stack.pollFirst();
                }
            }
            else {
                if (!stack.isEmpty() && stack.peekFirst() == i - 1){
                    subres.append(array[i]);
                    stack.pollFirst();
                    num[i]--;
                    dfs(sum, array, num, stack, subres, res);
                    subres.deleteCharAt(subres.length() - 1);
                    stack.offerFirst(i - 1);
                    num[i]++;
                }
            }
        }
    }
}
