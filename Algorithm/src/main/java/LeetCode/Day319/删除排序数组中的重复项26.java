package LeetCode.Day319;
/**
 * @ Description   :  https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-19 20:12
 */
public class 删除排序数组中的重复项26 {
    // 快慢指针
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length == 1){
            return nums.length;
        }
        int i = 0,j =1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }else{
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        return i+1;
    }
}
