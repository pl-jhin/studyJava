package LeetCode.Day21017;

/**
 * @ Description   :  https://leetcode-cn.com/problems/number-of-good-pairs/
 * @ Author        :  Adios
 * @ CreateDate    :  2021-01-07 16:26
 */
public class easy1512 {
    public static int numIdenticalPairs(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i]==nums[j]) num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(numIdenticalPairs(nums));
    }
}
