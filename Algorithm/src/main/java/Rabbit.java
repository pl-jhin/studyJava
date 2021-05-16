/**
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子
 * 小兔子长到第三个月后每个月又生一对兔子
 * 假如兔子都不死，问每个月的兔子总数
 */
public class Rabbit {
    public static void main(String[] args) {
        int f1=2,f2=2,f;
        int M=12;
        System.out.println(2);
        System.out.println(2);
        for(int i=3;i<M;i++) {
            f = f2;
            f2 = f1 + f2;
            f1 = f;
            System.out.println(f2);
        }
    }
}
