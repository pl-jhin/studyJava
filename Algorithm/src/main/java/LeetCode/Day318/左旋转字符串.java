package LeetCode.Day318;

/**
 * @ Description   :  https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-18 12:36
 */
public class 左旋转字符串 {
    // 类似复制字符串，遍历前n个 加入尾部。
    public static String reverseLeftWords(String s, int n) {
        if(n<=0) return null;
        StringBuilder sb = new StringBuilder(s);
        for(int i =0;i<n;i++){
            sb.append(sb.charAt(i));
        }
        sb.delete(0,n);
        return sb.toString();
    }
}
