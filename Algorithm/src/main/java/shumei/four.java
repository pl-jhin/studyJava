package shumei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class four {
        public static int getData(int index) {
            if(index==0)
                return 0;
            int[] a = new int[index];
            int count = 1;
            a[0] = 1;
            int index2 = 0;
            int index3 = 0;
            int index7 = 0;
            //判断数组未满
            while(count<index){
                //从小开始
                int min = min(a[index2]*2,a[index3]*3,a[index7]*7);
                a[count] = min;
                while(a[index2]*2<=a[count]) {
                    System.out.println("第1个循环："+Arrays.toString(a));
                    index2++;
                }
                while(a[index3]*3<=a[count]) {
                    System.out.println("第2个循环："+Arrays.toString(a));
                    index3++;
                }
                while(a[index7]*7<=a[count]) {
                    System.out.println("第3个循环："+Arrays.toString(a));
                    index7++;
                }
                count++;
            }
            int result = a[index-1];
            return result;
        }

        public static int min(int a,int b,int c){
            int temp = a>b?b:a;
            return temp>c?c:temp;
        }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList list = new ArrayList<Integer>();
        while (true){
            int index = in.nextInt();
            list.add(index);
            if (index==0) break;
        }
        for (int i = 0 ;i<list.size()-1;i++){
            System.out.println(getData((Integer) list.get(i)));
        }
    }
}
