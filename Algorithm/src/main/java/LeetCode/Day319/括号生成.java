package LeetCode.Day319;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Description   :  https://leetcode-cn.com/problems/generate-parentheses/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-19 12:54
 */
public class 括号生成 {

    public static List<String> generateParenthesis(int n) {
        List<String> stringList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(stringList,sb,0,0,n);
        return stringList;
    }
    static void dfs(List<String> ret, StringBuilder sb, int ln, int rn, int n) {
        // 截止条件
        if (ln + rn == 2 * n) {
         ret.add(new String(sb));
         return;
        }
        // 候选节点+筛选
        if (ln < n) {
         sb.append("(");
         dfs(ret, sb, ln + 1, rn, n);
         sb.deleteCharAt(sb.length() - 1);
        }
        if (rn < ln) {
         sb.append(")");
         dfs(ret, sb, ln, rn + 1, n);
         sb.deleteCharAt(sb.length() - 1);
        }
    }

}
