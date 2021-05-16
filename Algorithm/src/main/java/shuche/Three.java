package shuche;

import java.util.*;

public class Three {
    static int function(Object[] arr1, Object[] arr2) {
        int result = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if ((int) arr1[j] <= (int) arr2[i]) {
                    System.out.println(arr1[i] + "--" + arr2[j]);
                    result++;
                    break;
                }
            }
        }
        return result;
    }

    static Object[] getArr(HashMap map) {
        List list = new ArrayList();
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();

        for (Map.Entry<Integer, Integer> entry : entrySet) {
            list.add(entry.getValue());
        }
        Object[] array = list.toArray();
        return array;
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a1 = in.nextInt();
//        int[] arr1 = new int[a1];
        int[] arr1 ={1,2,1,1,2,3};
        // {1,2}
//        for (int i = 0; i < a1; i++) {
//            arr1[i]=in.nextInt();
//        }
//        int a2 = in.nextInt();
//        int[] arr2 = new int[a2];
//        for (int i = 0; i < a2; i++) {
//            arr2[i]=in.nextInt();
//        }
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map1.put(arr1[i], arr1[i]);
        }
//        Map<Integer, Integer> map2 = new HashMap<>();
//        for (int i = 0; i < arr2.length; i++) {
//            map2.put(arr2[i], arr2[i]);
//        }
        Object[] getArr1 = getArr((HashMap) map1);
//        Object[] getArr2 = getArr((HashMap) map2);
        System.out.println(Arrays.toString(getArr1));
//        System.out.println(Arrays.toString(getArr2));
//        System.out.println(function(getArr1, getArr2));

    }
}
