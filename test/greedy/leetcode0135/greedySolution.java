package leetcode.test.greedy.leetcode0135;

import java.util.Arrays;

public class greedySolution {
    public static void main(String[] args) {
        int[] ratings = new int[]{1,0,2};
        System.out.println(candy(ratings));
    }
    public static int candy(int[] ratings) {
        int[] size = new int[ratings.length];
        Arrays.fill(size, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]){
                size[i] = size[i - 1] + 1;
            }
        }
        int sum = 0;

        for (int j = ratings.length - 2; j >= 0; j--) {
            if (ratings[j + 1] < ratings[j] && size[j] <= size[j + 1]) {
                size[j] = Math.max(size[j + 1] + 1, size[j] + 1);
            }
            sum = sum + size[j + 1];
        }
        sum = sum + size[0];
        return sum;
    }
}
