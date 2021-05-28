package LeetCode.Day210528;

import java.util.Arrays;

/**
 * @date 2021/5/28 8:16
 * @Description https://leetcode-cn.com/problems/maximum-ice-cream-bars/
 */
public class Medium1833 {
    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int result = 0;
        for (int cost : costs) {
            coins -= cost;
            if (coins >= 0) result++;
            else return result;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] costs={1,3,2,4,1};
        int coins = 7;
        System.out.println(maxIceCream(costs, coins));
    }
}
