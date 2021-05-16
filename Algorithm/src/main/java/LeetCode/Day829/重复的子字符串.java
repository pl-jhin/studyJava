package LeetCode.Day829;
/**
 * @ Description   :  https://leetcode-cn.com/problems/repeated-substring-pattern/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-08-29 11:24
 */
public class 重复的子字符串 {
    public static boolean repeatedSubstringPattern(String s) {
        int i = (s + s).indexOf(s, 1);
        System.out.println(i);
        return (s + s).indexOf(s, 1) != s.length();
    }

    public static void main(String[] args) {
        String s = "abcabcabcabc";
        repeatedSubstringPattern(s);
    }
}
