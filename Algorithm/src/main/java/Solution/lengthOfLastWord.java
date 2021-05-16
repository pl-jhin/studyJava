package Solution;

import java.util.Arrays;

/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 *
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 *
 * 示例:
 *
 * 输入: "Hello World"
 * 输出: 5
 *
 */
public class lengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        if (!(str.length==0)) {
            String s1 = str[str.length - 1];
            return s1.length();
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        String s= " ";
        String[] s1 = s.split(" ");
        System.out.println(Arrays.toString(s1));
        System.out.println(lengthOfLastWord(s));
    }
}
