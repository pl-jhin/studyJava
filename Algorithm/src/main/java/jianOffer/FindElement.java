package jianOffer;

/**
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class FindElement {
    public static boolean Find(int target, int [][] array) {
        for (int[] ints : array) {
            int low = 0;
            int high = ints.length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (target > ints[mid])
                    low = mid + 1;
                else if (target < ints[mid])
                    high = mid - 1;
                else
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,8,9},{4,7,10,13}, };
        System.out.println(Find(7,arr));
    }
}
