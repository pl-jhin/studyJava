package LeetCode.Day210524;

import java.util.Arrays;

/**
 * @date 2021/5/24 8:20
 * @Description https://leetcode-cn.com/problems/majority-element/
 */
public class Easy169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
