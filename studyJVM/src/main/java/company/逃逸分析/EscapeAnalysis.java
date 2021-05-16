package company.逃逸分析;

//-XX:-DoEscapeAnalysis //逃逸分析
//-XX:-EliminateAllocations //标量替换
// 可达性分析 GC-Root
// 直接回收了。但是，分配在栈
// GC主要在堆
// 栈上分配对象
public class EscapeAnalysis {
    // 栈帧 基本数据类型
    public static void main(String[] args) {
        while (true){
            // Object对象，只在循环中使用
            new Object();
        }
    }
    //list=a list=null 避免内存泄漏  a不可能被回收 a没用 一块内存空间，被无用对象占用 100M 无用对象占了90M 可用对内存10M
    //
    class User{
        int age;
        String name;// ->char[]
        double dsadsa;
    }
}
