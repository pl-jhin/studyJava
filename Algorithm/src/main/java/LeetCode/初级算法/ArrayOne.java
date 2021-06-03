package LeetCode.初级算法;
/**
 * @date 2021/6/2 8:24
 * @Description 删除排序数组中的重复项
 */
public class ArrayOne {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0||nums.length==1){
            return nums.length;
        }
        int thisIndex = 0;
        int result = 1;
        for (int i = 1; i <nums.length; i++) {
            if (nums[thisIndex]!=nums[i]) {
                result++;
                nums[thisIndex+1] = nums[i];
                thisIndex++;
            }
        }
        return result;
    }
}
