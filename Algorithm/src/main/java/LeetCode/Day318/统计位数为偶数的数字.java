package LeetCode.Day318;
/**
 * @ Description   :  https://leetcode-cn.com/problems/find-numbers-with-even-number-of-digits/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-18 13:13
 */
public class 统计位数为偶数的数字 {
    public int findNumbers(int[] nums) {
        // 普通遍历判断
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int count=1;
            int num=nums[i];
            while (num>=10){
                num=num/10;
                count++;
            }
            if (count%2==0) result++;
        }
        return result;
    }

}
