package LeetCode.Day319;
/**
 * @ Description   :  https://leetcode-cn.com/problems/longest-palindrome/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-19 11:13
 */
public class 最长回文串 {
    // 单个字符转换为ASCII码遍历奇数和偶数即可
    public static int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            // 过滤奇数个，如3/2*2 =2
            // 1/2*2=0
            ans += v / 2 * 2;
            System.out.println(ans);
            // 当前字符个数是奇数 但是结果是偶数，++ 反之不加
            if (v % 2 == 1 && ans % 2 == 0)
                ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
}
