package LeetCode.Day210519;

import java.util.Arrays;

/**
 * @date 2021/5/19 8:07
 * @Description https://leetcode-cn.com/problems/merge-sorted-array/
 */
public class Easy88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < m || j < n) {
            if (i == m) {
                result[index] = nums2[j];
                index++;
                j++;
            } else if (j == n) {
                result[index] = nums1[i];
                index++;
                i++;
            } else if (nums1[i] < nums2[j]) {
                result[index] = nums1[i];
                index++;
                i++;
            } else {
                result[index] = nums2[j];
                index++;
                j++;
            }
        }
        for (int k = 0; k < result.length; k++) {
            nums1[k]=result[k];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {};
        merge(nums1, 3, nums2, 0);
    }
}
