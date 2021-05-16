package Solution;

import java.util.List;
import java.util.Random;

/**
 * title :给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 * 例如，给出 n = 3，生成结果为：
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 * 思路一：
 * 转换为数学问题，即(的数学意义为1   )的数学意义为-1
 * 当N为3  则  (的数学意义为+1 +1 +1  可以推出)为-1 -1 -1
 *
 */
public class generateParenthesis {
    public List<String> generateParenthesis(int n) {
        StringBuilder string = getString(n);
        String str = String.valueOf(string);
        str = str.replaceAll("-1",")");
        str = str.replaceAll("1","(");
        System.out.println(str);
        return null;
    }
    public StringBuilder getString(int n){
        StringBuilder value = new StringBuilder();
        int index = 0;
        int sum = 0;
        int max = 2*n;
        int num ;
        while(index<max){
            Random random =new Random();
            if (index == 0){
                num = 1;
            }else if (index==max){
                num = -1;
            }else {
                num = 2 * random.nextInt(2) - 1;
            }
            value.append(num);
            sum = sum +num;
            System.out.println(sum);
            index++;
        }
        System.out.println(sum);
        return value;
    }

    public static void main(String[] args) {
        generateParenthesis generateParenthesis = new generateParenthesis();
        generateParenthesis.generateParenthesis(3);
    }
}
