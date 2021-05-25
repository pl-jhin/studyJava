package LeetCode.Day210525;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @date 2021/5/25 8:37
 * @Description https://leetcode-cn.com/problems/contains-duplicate/
 */
public class Easy217 {
    public boolean containsDuplicate(int[] nums) {
        Set setArray = new HashSet();
        for (int i = 0; i <nums.length ; i++) {
            if(setArray.contains(nums[i])) {
                return true;
            }
            else setArray.add(nums[i]);
        }
        return false;
    }
}
