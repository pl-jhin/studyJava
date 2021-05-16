package LeetCode.Day318;
/**
 * @ Description   :  https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-18 12:39
 */
public class 有多少小于当前数字的数字 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // 普通遍历
        if (nums.length<=0) return null;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                    count++;
            }
            result[i]=count;
        }        
        return result;
    }
}
