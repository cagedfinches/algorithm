package leetcode.test.dynamicprogramming.leetcode0070;

public class MomorizeClimbStairs {
    public static void main(String[] args) {
        int res = climbstairs(5);
        System.out.println(res);
    }
    public static int climbstairs(int n){
        int memo[] = new int[n + 1];
        return climbstairsN(n, memo);

    }
    public static int climbstairsN(int n, int[] memo){
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        int n1 = 0;
        if (memo[n - 1] == 0){
            n1 = climbstairsN(n - 1, memo);
            memo[n - 1] = n1;
        }
        else {
            n1 = memo[n - 1];
        }
        int n2 = 0;
        if (memo[n - 2] == 0){
            n2 = climbstairsN(n - 2, memo);
            memo[n - 2] = n2;
        }
        else{
            n2 = memo[n - 2];
        }
        return n1 + n2;
    }
}
