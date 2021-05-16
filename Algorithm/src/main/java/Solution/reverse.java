package Solution;
/*
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

示例 1:

输入: 123
输出: 321
 示例 2:

输入: -123
输出: -321
示例 3:

输入: 120
输出: 21
 */
public class reverse {
    public static int reverse(int x) {
        int num = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (num > Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (num < Integer.MIN_VALUE/10 || (num == Integer.MIN_VALUE / 10 && pop < -8)) return 0;


            num = num * 10 + pop;
        }
        return num;
    }

    public static void main(String[] args) {
        int x = -123;
        System.out.println(reverse(x));
    }
}
