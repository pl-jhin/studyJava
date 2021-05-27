package LeetCode.Day210527;
/**
 * @date 2021/5/27 8:15
 * @Description https://leetcode-cn.com/problems/max-consecutive-ones/submissions/
 */
public class Easy485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxOne = 0;
        int thisCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                thisCount++;
            } else {
                maxOne = Math.max(maxOne, thisCount);
                thisCount = 0;
            }
        }
        maxOne = Math.max(maxOne, thisCount);
        return maxOne;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
