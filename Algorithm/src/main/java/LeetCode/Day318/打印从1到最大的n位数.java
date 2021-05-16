package LeetCode.Day318;
/**
 * @ Description   :  https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-18 20:24
 */
public class 打印从1到最大的n位数 {
    // 先确定大小，再循环
    public int[] printNumbers(int n) {
        int num = 10;
        for (int j = 1; j < n; j++) {
            num = num*10;
        }
        int[] a = new int[num-1];
        for (int i = 1; i < num; i++) {
            a[i-1]=i;
        }
        return a;
    }
}
