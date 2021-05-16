package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        Arrays.sort(nums);
        int len = nums.length;
        if (nums==null||nums.length<3) return null;
        for (int i=0;i<nums.length ;i++) {
            if (nums[i]>0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int L=i+1;
            int R=len-1;
            while (L<R){
                int sum = nums[i]+nums[L]+nums[R];
                if (sum == 0){
                    list.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L<R && nums[L] == nums[L+1]) L++;
                    while (L<R && nums[R] == nums[R-1]) R--;
                    L++;R--;
                }
                else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] a ={-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(a));
    }
}
