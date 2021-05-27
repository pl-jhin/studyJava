package LeetCode.Day210527;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @date 2021/5/27 8:18
 * @Description https://leetcode-cn.com/problems/array-partition-i/
 */
public class Easy561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i+=2) {
            result+=nums[i];
        }
        return result;
    }
}
