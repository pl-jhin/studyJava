package LeetCode.Day318;
/**
 * @ Description   :  https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-18 20:39
 */
public class 替换空格 {
    // 同IP地址无效化那一题 遍历即可
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' ') sb.append("%20");
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
