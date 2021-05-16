package LeetCode.Day318;
/**
 * @ Description   :  https://leetcode-cn.com/problems/maximum-69-number/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-18 20:44
 */
public class L6和9组成的最大数字 {
    // 遍历转换，烦死了。
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i =0 ;i<chars.length;i++){
            if (chars[i]=='6') {
                chars[i] = '9';
                break;
            }
        }
        for (int i =0 ;i<chars.length;i++){
            stringBuilder.append(chars[i]);
        }
        return Integer.valueOf(stringBuilder.toString());
    }
}
