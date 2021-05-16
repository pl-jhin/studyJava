package LeetCode.Day318;
/**
 * @ Description   :  https://leetcode-cn.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-18 13:10
 */
public class 整数的各位积和之差 {
    // 普通遍历计算
    public int subtractProductAndSum(int n) {
        if (n<10) return 0;
        int result = 0;
        int num1,num2;
        num1 = 1;
        num2 = 0;
        while(n!=0){
            num1 *=n%10;
            num2 +=n%10;
            n/=10;
        }
        result = num1-num2;
        return result;
    }

}
