package com.penglei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 7, 8, 10, 12, 18};
        int b[] = {1, 2, 4, 5, 6, 7, 8, 9, 11, 12};
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        int i = 0;
        int j = 0;
        int aSize = a.length;
        int bSize = b.length;
        while (i < aSize || j < bSize) {
            if (i == aSize || j == bSize) break;
            if (a[i] == b[j]) {
                i++;
                j++;
                continue;
            }
            if (a[i] > b[j]) {
                list2.add(b[j]);
                j++;
                continue;
            }
            if (b[j] > a[i]) {
                list1.add(a[i]);
                i++;
                continue;
            }
        }
        if (i < j) {
            for (; i < aSize; i++) {
                list1.add(a[i]);
            }
        } else {
            for (; j < bSize; j++) {
                list2.add(b[j]);
            }
        }
        System.out.println(Arrays.toString(list1.toArray()));
        System.out.println(Arrays.toString(list2.toArray()));

    }
}
