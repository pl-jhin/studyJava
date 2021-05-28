package LeetCode.Day210528;
/**
 * @date 2021/5/28 8:21
 * @Description https://leetcode-cn.com/problems/running-sum-of-1d-array/
 */
public class Easy1480 {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        for (int i = 1; i <length; i++) {
            nums[i] = nums[i]+nums[i-1];
        }
        return nums;
    }
}
