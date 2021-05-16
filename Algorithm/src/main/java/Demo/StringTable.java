package Demo;

public class StringTable {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "a"+"b";
        String s4 = s1 + s2;
        String s5 = "ab";
        String s6 = s4.intern();
        String s7 = new String("a");
        String s8 = "ab";
        // 输出结果
        System.out.println("s1与s7:"+(s1 == s7));// false
        System.out.println("s3与s4:"+(s3 == s4));// false
        System.out.println("s3与s5:"+(s3 == s5));// true
        System.out.println("s3与s6:"+(s3 == s6));// true

        String x1 = new String("c")+new String("d");
        String x2 = "cd";
        System.out.println("x1与x2:"+(x1 == x2));

        String x3 = x1.intern();

        System.out.println("x3与s2:"+(x3 == x2));
        System.out.println("s5与s8:"+(s5==s8));


    }
}
