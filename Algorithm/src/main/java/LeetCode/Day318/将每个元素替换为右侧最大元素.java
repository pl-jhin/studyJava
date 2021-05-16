package LeetCode.Day318;
/**
 * @ Description   :  https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-18 21:07
 */
public class 将每个元素替换为右侧最大元素 {
    // 逆向遍历，遇见大的就替换就行了
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length-1; i >0 ; i--) {
            int temp = arr[i];
            arr[i]=max;
            if (temp>max) max =temp;
        }
        return arr;
    }
}
