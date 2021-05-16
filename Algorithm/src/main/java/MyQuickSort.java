import java.util.Arrays;

public class MyQuickSort {
    static int array[]={35,42,16,53,23,37,68,15};
    // 35 15 16 53 23 37 68 42
    // 35 15 16 23 53 37 68 42

    static void quickSort(int[] a,int begin,int end){
        int p,i,j,temp;
        if(begin >= end) {
            return;
        }
        p = a[begin];
        i = begin;
        j = end;
        while (i < j){
            while (a[j] >= p && i < j) j--;
            while (a[i] <= p && i < j) i++;
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        a[begin]=a[i];
        a[i]=p;
        System.out.println(j);
        System.out.println(Arrays.toString(a));

        quickSort(a,begin,j-1);
        quickSort(a,j+1,end);
    }

    public static void main(String[] args) {
        System.out.println("排序前："+ Arrays.toString(array));
        quickSort(array,0,array.length-1);
        System.out.println("排序后："+Arrays.toString(array));

    }
}
