package LeetCode.Day210520;

import java.util.*;

/**
 * @date 2021/5/20 8:16
 * @Description https://leetcode-cn.com/problems/top-k-frequent-words/
 */
public class Medium692 {
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new LinkedHashMap<>();
        int count = 1;
        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, count);
            } else {
                Integer thisCount = map.get(word);
                map.put(word, thisCount + 1);
            }
        }
        List<String> resultList = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            String word = "";
            Integer thisCount = 0;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() > thisCount) {
                    thisCount = entry.getValue();
                    word = entry.getKey();
                }
            }
            resultList.add(word);
            map.remove(word);
        }
        return resultList;
    }

    public static void main(String[] args) {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        List<String> strings = topKFrequent(words, 2);
        System.out.println(Arrays.toString(strings.toArray()));
    }
}
