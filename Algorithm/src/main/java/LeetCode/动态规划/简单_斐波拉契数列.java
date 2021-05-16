package LeetCode.动态规划;

public class 简单_斐波拉契数列 {
    static int f1(int num) {
        if (num == 1 || num == 2) return 1;
        else return f1(num - 1) + f1(num - 2);
    }

    static int f2(int num) {
        int result = 1;
        int pro = result;
        int next = result;
        if (num == 1 || num == 2) return result;
        for (int i = 3; i <= num; i++) {
            result = pro + next;
            next = pro;
            pro = result;
        }
        return result;
    }

    public static void main(String[] args) {
        int f1 = f1(8);
        System.out.println(f1);
        int f2 = f2(8);
        System.out.println(f2);
    }
}
