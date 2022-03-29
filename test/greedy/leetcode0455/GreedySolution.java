package leetcode.test.greedy.leetcode0455;

import java.util.Arrays;

public class GreedySolution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0;
        int cookies = 0;
        while(child < g.length && cookies < s.length){
            if(g[child] <= s[cookies]){
                child++;
            }
            cookies++;
        }
        return child;
    }
}
