package LeetCode.Day210518;

/**
 * @date 2021/5/18 8:18
 * @Description https://leetcode-cn.com/problems/maximum-subarray/
 */
public class Easy53 {
    public static int maxSubArray(int[] nums) {
        int maxNumber = nums[0];
        int pre = 0;
        for (int indexNumber : nums) {
            pre = Math.max(pre + indexNumber, indexNumber);
            maxNumber = Math.max(maxNumber, pre);
            System.out.println("当前的pre和maxNumber为：" + pre + "======" + maxNumber);
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int i = maxSubArray(nums);
        System.out.println(i);
    }
}
