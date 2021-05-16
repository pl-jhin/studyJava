package LeetCode.Day21017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ Description   :  https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/
 * @ Author        :  Adios
 * @ CreateDate    :  2021-01-07 16:27
 */
public class easy1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List ans = new ArrayList<Boolean>();
        int max =Arrays.stream(candies).max().getAsInt();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]+extraCandies<max) ans.add(false);
            else ans.add(true);
        }
        return ans;
    }
    public static String fun(int value) {
        char[] m = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int len = m.length;
        int d = value / len;
        int r = value % len;
        return (d == 0) ? String.valueOf(m[r]) : fun(d) + m[r];
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        kidsWithCandies(candies,3);
        System.out.println(Arrays.asList("Hello", "World", "How", "Are", "You").stream()
                .map(s -> "_" + s + "_").reduce((s1, s2) -> s1 + "," + s2).get());
        System.out.println(fun(203350));

    }
}
