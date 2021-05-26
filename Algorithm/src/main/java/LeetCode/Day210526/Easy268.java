package LeetCode.Day210526;
/**
 * @date 2021/5/26 8:47
 * @Description https://leetcode-cn.com/problems/missing-number/comments/
 */
public class Easy268 {
    public static int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i <= nums.length; i++) {
            sum+=i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
}
