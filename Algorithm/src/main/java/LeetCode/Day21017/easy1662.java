package LeetCode.Day21017;

import java.util.ArrayList;
import java.util.List;
/**
 * @ Description   :  https://leetcode-cn.com/problems/check-if-two-string-arrays-are-equivalent/
 * @ Author        :  Adios
 * @ CreateDate    :  2021-01-07 16:11
 */
public class easy1662 {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int num = word1.length;
        List strList1 = new ArrayList<String>();
        List strList2 = new ArrayList<String>();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < word1[i].length(); j++) {
                strList1.add(word1[i].charAt(j));
            }
        }
        for (int i = 0; i < word2.length; i++) {
            for (int j = 0; j < word2[i].length(); j++) {
                strList2.add(word2[i].charAt(j));
            }
        }
        if (strList1.size()!= strList2.size()) return false;
        for (int i = 0; i < strList1.size(); i++) {
            if (strList1.get(i)!=strList2.get(i)) return false;
        }
        return true;
    }
    public static boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (String i : word1) {
            s1.append(i);
        }
        for (String i : word2) {
            s2.append(i);
        }
        return s1.toString().equals(s2.toString());
    }

    public static void main(String[] args) {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
