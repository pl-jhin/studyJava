package Solution;
/*
给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]

 */

public class twoSum {
    public static int[] twoSum(int[] nums , int target ){
        for (int i = 0;i<nums.length;i++){
            for (int j = 0;j<nums.length;j++){
                int num = target - nums[i];
                System.out.println(num);
                if (j==i) continue;
                else {
                    if (num == nums[j]){
                        System.out.println("i="+i+"j="+j);
                        int[] array = {i,j};
                        return array;
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 13;
        int[] array=twoSum(nums,target);
        if (array!=null) {
            for (int i : array) {
                System.out.println(i);
            }

        }
        else {
            System.out.println("未找到");
        }
    }
}
