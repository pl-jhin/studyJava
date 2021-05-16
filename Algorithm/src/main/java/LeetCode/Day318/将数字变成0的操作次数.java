package LeetCode.Day318;
/**
 * @ Description   :  https://leetcode-cn.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-18 12:46
 */
public class 将数字变成0的操作次数 {
    // 普通判断
    public static int numberOfSteps (int num) {
        int sum = 0;
        while(num!=0){
            sum++;
            if(num%2==0){
                num=num/2;
            }
            else{
                num=num-1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }

}
