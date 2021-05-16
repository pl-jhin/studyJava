package LeetCode.Day319;
/**
 * @ Description   :  https://leetcode-cn.com/problems/valid-parentheses/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-19 19:55
 */
public class 有效的括号20 {
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        for (char c:s.toCharArray()) {
            if (c=='(') {
                sb.append(c);
                i++;
            }
            else if (c=='[') {
                sb.append(c);
                i++;
            }
            else if (c=='{') {
                sb.append(c);
                i++;
            }
            else if (c==')'){
                if (sb.length()==0||sb.charAt(sb.length()-1)!='(') return false;
                else {
                    sb.deleteCharAt(sb.length()-1);
                    i--;
                }
            }
            else if (c==']'){
                if (sb.length()==0||sb.charAt(sb.length()-1)!='[') return false;
                else {
                    i--;
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else if (c=='}'){
                if (sb.length()==0||sb.charAt(sb.length()-1)!='{') return false;
                else {
                    i--;
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        }
        if (i==0) return true;
        else return false;
    }
}
