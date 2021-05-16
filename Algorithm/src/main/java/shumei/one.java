package shumei;

import java.util.Arrays;

public class one {

    public static void main(String[] args) {
        int[] a = {1,3,5,7,9};
        int[] b = {2,4,6,8,10,11};
        System.out.println(Arrays.toString(hebing(a,b)));
    }
    private static int[] hebing(int[] one, int[] tow) {
        //定义数组
        int[] result = new int[one.length + tow.length];
        int i = 0, j = 0;
        int overIndex = 0;
        //先加入到新数组
        while (i < one.length && j < tow.length) {
            if (one[i] < tow[j]) {
                result[overIndex++] = one[i++];
            } else {
                result[overIndex++] = tow[j++];
            }
        }
        int l;
        //多出的长度
        if (one.length<tow.length){
            for (l = j; l < tow.length; l++) {
                result[overIndex++] = tow[l];
            }
        }else {
            for (l = i; l < one.length; l++) {
                result[overIndex++] = one[l];
            }
        }
        return result;
    }
}
