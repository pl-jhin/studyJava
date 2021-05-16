package LeetCode.Day318;
/**
 * @ Description   :  https://leetcode-cn.com/problems/jewels-and-stones/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-18 13:25
 */
public class 宝石与石头 {
    // 普通遍历判断
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0;i<J.length();i++){
            for (int j = 0; j <S.length(); j++) {
                if (J.charAt(i)==S.charAt(j)) count++;
            }
        }
        return count;
    }
}
