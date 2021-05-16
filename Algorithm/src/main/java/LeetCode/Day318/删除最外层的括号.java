package LeetCode.Day318;
/**
 * @ Description   :  https://leetcode-cn.com/problems/remove-outermost-parentheses/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-18 15:41
 */
public class 删除最外层的括号 {
    // 加个num标识 遇到'('标识++ 反之--
    // 但是第一个需要使用num++，使用num++的特性，先比较再自增，即去掉外面的'('
    // 同样的，使用--num 先自减再比较，去掉外面的')'
    public static String removeOuterParentheses(String S) {
        int num = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i)=='('&& num++>0) sb.append(S.charAt(i));
            if (S.charAt(i) == ')' && --num > 0)sb.append(S.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s= "(()())(())";
        String s1 = removeOuterParentheses(s);
        System.out.println(s1+"长度为"+s1.length());
        System.out.println(s.length());
    }
}
