package LeetCode.Day318;
/**
 * @ Description   :  https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-18 14:14
 */
public class 分割平衡字符串 {
    // 加个标识 如果是R 就是++  是L—- 当num=0时，即平衡了result++
    public int balancedStringSplit(String s) {
        int result = 0;
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='R') num++;
            else num--;
            if (num==0) result++;
        }
        return result;
    }
}
