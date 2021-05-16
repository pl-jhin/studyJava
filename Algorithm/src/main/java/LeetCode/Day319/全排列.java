package LeetCode.Day319;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ Description   :  https://leetcode-cn.com/problems/permutations/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-19 12:53
 */
public class 全排列 {
    //DFS即可
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        boolean[] pb = new boolean[nums.length];
        dfs(nums,lists,pb,new ArrayList<Integer>());
        return lists;
    }
    static void  dfs(int[] nums , List<List<Integer>> lists ,boolean[] pb,List<Integer> list ){
        // 截止条件
        if (list.size()==nums.length){
            lists.add(new ArrayList<>(list));
            return;
        }
        // 候选节点
        for (int i = 0; i < nums.length; i++) {
            if (!pb[i]) {
                pb[i] = true;
                list.add(nums[i]);
                dfs(nums, lists, pb, list);
                list.remove(list.size() - 1);
                pb[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {1,2,3};
        System.out.println(Arrays.toString(permute(num).toArray()));
    }
}
