package LeetCode.Day318;

import java.util.ArrayList;

/**
 * @ Description   :  https://leetcode-cn.com/problems/decompress-run-length-encoded-list/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-18 13:20
 */
public class 解压缩编码列表 {
    // 普通遍历，然后存入数组即可 ，注意 i= i+2;
    public int[] decompressRLElist(int[] nums) {
        if (nums.length%2!=0) return null;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i=i+2) {
            int begin= nums[i];
            int end = nums[i+1];
            for (int j = 0;j<begin;j++){
                list.add(end);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i]=list.get(i);
        }
        return result;
    }
}
