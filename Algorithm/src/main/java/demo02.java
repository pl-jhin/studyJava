public class demo02 {
    public static void main(String[] args) {
        System.out.println(demo3(10));
    }
    static int demo3(int n){
        int num1 = 1;
        int num2 = 2;
        if (n==num1) return 1;
        if (n==num2) return 2;
        while (n>2){
            int sum = demo3(n-1);
            return demo3(n-1)+demo3(n-2);
        }
        return 0;
    }
}
