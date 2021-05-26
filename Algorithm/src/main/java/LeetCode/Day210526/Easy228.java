package LeetCode.Day210526;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2021/5/26 8:09
 * @Description https://leetcode-cn.com/problems/summary-ranges/comments/
 */
public class Easy228 {
    public static List<String> summaryRanges(int[] nums) {
        List<String> resultList = new ArrayList<>();
        if (nums.length==0) return resultList;
        if (nums.length==1) {
            resultList.add(nums[0]+"");
            return resultList;
        }
        int begin = nums[0];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (begin + index != nums[i]) {
                if (begin==nums[i-1]){
                    resultList.add(begin+"");
                }else {
                    resultList.add(begin + "->" + nums[i - 1]);
                }
                begin = nums[i];
                index = 0;
                i--;
            } else {
                index++;
            }
            if (i==nums.length-1){
                if (begin==nums[i]) {
                    resultList.add(begin + "");
                }else {
                    resultList.add(begin+"->"+nums[i]);
                }
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        int[] nums = {};
        List<String> strings = summaryRanges(nums);
        strings.stream().forEach(System.out::println);
    }
}
