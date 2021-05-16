package LeetCode.Day320;

import java.util.Arrays;

/**
 * @ Description   :  https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-20 13:21
 */
public class 最小的k个数 {
    public static int[] getLeastNumbers(int[] arr, int k) {
        quickSort(arr,0,arr.length-1);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i]=arr[i];
        }
        return res;
    }
    static void quickSort(int[] arr , int l,int r){
        if (l>=r) return;
        int p=arr[l] ,i=l,j=r;
        int temp;
        while (i<j){
            System.out.println(i+"---"+j);
            while (arr[j]>=p && i<j) --j;
            while (arr[i]<=p && i<j) ++i;
            temp=arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
        }
        arr[l]=arr[i];
        arr[i] = p;
        quickSort(arr,l,j-1);
        quickSort(arr,i+1,r);
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1};
        int[] leastNumbers = getLeastNumbers(arr, 2);
        System.out.println(Arrays.toString(leastNumbers));
    }

}
