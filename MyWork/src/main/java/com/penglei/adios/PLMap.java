package com.penglei.adios;

public class PLMap {
    // 链表
    class PLNode {
        int hash; //散列值
        String key; //key
        Integer value; //value
        PLNode next; //链表的next

        public PLNode(int hash, String key, Integer value, PLNode next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    // 数组
    PLNode[] table;

    // 初始化数组
    public PLMap(int size) {
        table = new PLNode[size];
    }

    public int hash(String key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    public Integer putPlMap(String key, Integer value) {
        // 计算key的哈希值
        int h = hash(key);
        // 获得桶的位置
        int index = h % table.length;
        // 如果第一个位置为null
        if (table[index] == null) {
            table[index] = new PLNode(h, key, value, null);
        } else {
            // 遍历，找到该在的链表位置
            PLNode e;
            PLNode p = table[index];
            while (true) {
                e = p;
                if (e != null && p.key.equals(key)) {
                    p.value = value;
                    break;
                }
                if ((e = p.next) == null) {
                    p.next = new PLNode(h, key, value, null);
                    break;
                }
                p = e;
            }
        }
        return value;
    }

    // 获得值
    Integer get(String key) {
        PLNode first, e;
        int h = hash(key);
        // 获得桶的位置
        int index = h % table.length;
        first = table[index];
        if ((e = first) != null) {
            if (first.hash == h) return first.value;
        } else {
            do {
                e = e.next;
                if (e.hash == h) return first.value;
            } while (e.next != null);
        }
        return null;
    }

    public static void main(String[] args) {
        String[] keys = {"苹果", "橘子", "香蕉", "菠萝"};
        Integer[] values = {5, 4, 6, 10};
        PLMap map = new PLMap(8);
        for (int i = 0; i < keys.length; i++) {
            map.putPlMap(keys[i], values[i]);
        }
        System.out.println("价格为:"+map.get("橘子"));
        map.putPlMap("橘子", 7);
        System.out.println("修改后价格为:"+map.get("橘子"));

    }

}
