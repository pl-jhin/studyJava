package Solution;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 * 示例 1:
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 *
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 *
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 *
 * 输入: [1,3,5,6], 0
 * 输出: 0
 * 应该用二分查找
 *
 */
public class searchInsert
{
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        if (target <= nums[left]) return 0;
        if (target >nums[right-1]) return right;
        for (; left < right; ) {
            if (target==nums[right-1]) return right-1;
            if (target > nums[left]) left++;
            if (target<nums[right-1]) right--;
            if (target == nums[left]) return left;
            System.out.println(left+"+++"+right);
            if (left == right||left>right) return left;
        }
        return  0;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,5,6,9};
        int i = searchInsert(nums, 7);
        System.out.println(i);

    }
}
