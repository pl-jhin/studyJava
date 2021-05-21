package LeetCode.Day210521;
/**
 * @date 2021/5/21 8:15
 * @Description https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 */
public class Easy121 {
    public static int maxProfit(int[] prices) {
        int maxPrice = 0;
        int minPrice = prices[0];
        for (int price : prices) {
            maxPrice = Math.max(price - minPrice, maxPrice);
            minPrice = Math.min(price, minPrice);
        }
//        for (int i = 0; i < prices.length; i++) {
//            int price = prices[i];
//            for (int j = i; j <prices.length ; j++) {
//                maxPrice = Math.max(prices[j] - price, maxPrice);
//            }
//        }
        return maxPrice;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int maxPrice = maxProfit(prices);
        System.out.println(maxPrice);
    }
}
