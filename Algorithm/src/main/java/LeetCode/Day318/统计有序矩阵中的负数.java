package LeetCode.Day318;
/**
 * @ Description   :  https://leetcode-cn.com/problems/count-negative-numbers-in-a-sorted-matrix/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-18 13:53
 */
public class 统计有序矩阵中的负数 {
    // 如矩阵
    //  4    3   2  -1
    //  3    2   1  -1
    //  1    1  -1  -2
    // -1   -1  -2  -3
    // 横向和纵向都是递减的
    // 横向从后面往前判断即可
    public int countNegatives(int[][] grid) {
        int result = 0;
        int row=grid.length;
        int col=grid[0].length;
        for(int i = 0, j = col - 1; i < row && j >= 0; ){
            if(grid[i][j] >= 0){
                i++;
            }else{
                result += grid.length - i;
                j--;
            }
        }
        return result;
    }

}
