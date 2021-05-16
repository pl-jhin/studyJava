package company.逃逸分析;

import java.util.ArrayList;
import java.util.List;
// 普通的分配在堆中的对象
public class OutOfMemory {
    public static void main(String[] args) {
        List list  = new ArrayList();
        while (true){
            list.add(new Object());
        }
    }
}
