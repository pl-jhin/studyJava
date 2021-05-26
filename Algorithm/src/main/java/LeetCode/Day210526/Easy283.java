package LeetCode.Day210526;
/**
 * @date 2021/5/26 8:47
 * @Description https://leetcode-cn.com/problems/move-zeroes/
 */
public class Easy283 {
    public void moveZeroes(int[] nums) {
        int zeroNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                zeroNumber++;
            }else {
                nums[i-zeroNumber] = nums[i];
            }
        }
        for (int i = nums.length-zeroNumber; i < nums.length; i++) {
            nums[i]=0;
        }
    }
}
