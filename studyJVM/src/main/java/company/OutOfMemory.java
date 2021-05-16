package company;

import java.util.ArrayList;
import java.util.List;

/**
 * 内存溢出状态
 * 原因是无限new一个新的Object 导致虚拟机在扩展栈时无法申请到足够大的内存空间
 * OOM
 */
// GC GC-ROOT 可达性分析(JVM判断对象是否可以被回收) ｜｜标记计数法
//   可达性分析

public class OutOfMemory {
    volatile String str = "";
    static byte b= 1;
    static Object o = new Object();
    public static void main(String[] args) {
        Test1();
    }
    // new list
    // list.add(new 对象)
    // 新建的对象一直在被List引用
    public static void Test1(){
        List list  = new ArrayList();
        while (true){
            list.add(new Object());
        }

    }

}
