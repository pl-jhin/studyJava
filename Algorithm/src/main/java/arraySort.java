import java.util.Arrays;

public class arraySort {
    static int a[] ={9,4,2,3,5,7,6,1};
    //插入排序
    static void insertion_sort (int a[], int n) {
        int i,j,v;
        for (i=1; i<n; i++) {  //如果第i个元素小于第j个，则第j个向后移动
            for (v=a[i], j=i-1; j>=0&&v<a[j]; j--)
                a[j+1]=a[j];
            a[j+1]=v;
        }
    }
    //选择排序
    static void selection_sort (int a[], int n) {
        int i,j,pos,tmp;
        for (i=0; i<n-1; i++) {  //寻找最小值的下标
            for (pos=i, j=i+1; j<n; j++)
                if (a[pos]>a[j])
                    pos=j;
            if (pos != i) {
                tmp=a[i];
                a[i]=a[pos];
                a[pos]=tmp;
            }
        }
    }
    //冒泡排序
    static void bubble_sort (int a[], int n) {
        int i, j, lastSwap, tmp;
        for (j=n-1; j>0; j=lastSwap) {        lastSwap=0;     //每一轮要初始化为0，防止某一轮未发生交换，lastSwap保留上一轮的值进入死循环
            for (i=0; i<j; i++) {
                if (a[i] > a[i+1]) {
                    tmp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=tmp;//最后一次交换位置的坐标
                    lastSwap = i;
                }
            }
        }
    }
    //快速排序
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = (int) (start + Math.random() * (end - start + 1));
        int smallIndex = start - 1;
        swap(array, pivot, end);
        for (int i = start; i <= end; i++)
            if (array[i] <= array[end]) {
                smallIndex++;
                if (i > smallIndex)
                    swap(array, i, smallIndex);
            }
        return smallIndex;
    }
    private static void quick_sort(int[] array, int start, int end) {
        // 排序无意义或参数有误
        if (start < 0 || end >= array.length || start > end) return ;

        int smallIndex = partition(array, start, end);
        if (smallIndex > start)
            quick_sort(array, start, smallIndex - 1);
        if (smallIndex < end)
            quick_sort(array, smallIndex + 1, end);
    }
    // 快速排序2
    public static void quickSort(int[] arr,int low,int high) {
        int p,i,j,temp;
        if(low >= high) {
            return;
        }
        //p就是基准数,这里就是每个数组的第一个
        p = arr[low];
        i = low;
        j = high;
        // i低位 j高位
        while(i < j) {
            //右边当发现小于p的值时停止循环
            while(arr[j] >= p && i < j) {
                j--;
            }
            //这里一定是右边开始，上下这两个循环不能调换
            //左边当发现大于p的值时停止循环
            while(arr[i] <= p && i < j) {
                i++;
            }
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        arr[low] = arr[i];//这里的arr[i]一定是停小于p的，经过i、j交换后i处的值一定是小于p的(j先走)
        arr[i] = p;
        System.out.println(Arrays.toString(a));
        quickSort(arr,low,j-1);  //对左边快排
        quickSort(arr,j+1,high); //对右边快排
    }
    //堆排序
    static void heapAdjust(int a[], int i, int nLength)
    {
        int nChild;
        int nTemp;
        for (nTemp = a[i]; 2 * i + 1 < nLength; i = nChild)
        {
            // 子结点的位置=2*（父结点位置）+ 1
            nChild = 2 * i + 1;
            // 得到子结点中较大的结点
            if ( nChild < nLength-1 && a[nChild + 1] > a[nChild])
                ++nChild;
            // 如果较大的子结点大于父结点那么把较大的子结点往上移动，替换它的父结点
            if (nTemp < a[nChild])
            {
                a[i] = a[nChild];
                a[nChild]= nTemp;
            }
            else
                // 否则退出循环
                break;
        }
    }
    // 堆排序算法
    static void heap_sort(int a[],int length)
    {
        int tmp;
        // 调整序列的前半部分元素，调整完之后第一个元素是序列的最大的元素
        //length/2-1是第一个非叶节点，此处"/"为整除
        for (int i = length / 2 - 1; i >= 0; --i)
            heapAdjust(a, i, length);
        // 从最后一个元素开始对序列进行调整，不断的缩小调整的范围直到第一个元素
        for (int i = length - 1; i > 0; --i)
        {
            // 把第一个元素和当前的最后一个元素交换，
            // 保证当前的最后一个位置的元素都是在现在的这个序列之中最大的
            ///  Swap(&a[0], &a[i]);
            tmp = a[i];
            a[i] = a[0];
            a[0] = tmp;
            // 不断缩小调整heap的范围，每一次调整完毕保证第一个元素是当前序列的最大值
            heapAdjust(a, 0, i);
        }
    }

    public static void main(String[] args) {
        System.out.println("排序前："+Arrays.toString(a));
        quickSort(a,0,a.length-1);
        System.out.println("排序后："+Arrays.toString(a));
    }
}
