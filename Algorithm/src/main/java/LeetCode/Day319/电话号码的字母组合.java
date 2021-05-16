package LeetCode.Day319;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Description   :  https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-19 13:23
 */
public class 电话号码的字母组合 {
    // 定义二维数组一一对应
    static char[][] chars ={
            {},{},{'a','b','c'},{'d','e','f'},
            {'g','h','i'},{'j','k','l'},{'m','n','o'},
            {'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}
    };
    public static List<String> letterCombinations(String digits) {
        if (digits.length()==0) return null;
        List<String> list =new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(list,sb,0,digits);
        return list;
    }
    static void dfs(List list,StringBuilder sb,int index,String str){
        // 截止条件
        if (sb.length()==str.length()){
            list.add(sb.toString());
            return;
        }
        // 候选节点
        for (char c: chars[str.charAt(index)-'0']) {
            sb.append(c);
            dfs(list,sb,index+1,str);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23").toString());
    }
}
