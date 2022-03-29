package leetcode.test.dynamicprogramming.leetcode0070;

public class ClimbingStairs {
    public static void main(String[] args) {
        int res = climbingstairs(6);
        System.out.println(res);
    }

    public static int climbingstairs(int n){
        int n1 = 1;
        int n2 = 2;
        if (n == 1){
            return n1;
        }
        if (n == 2){
            return n2;
        }

        for(int i = 3; i <= n; i++){
            int temp = n2;
            n2 = n1 + n2;
            n1 = temp;
        }
        return n2;
    }
}
