package ForkAndJoin;

public class CountTest1 {
    private int start;
    private int end;

    public CountTest1(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public  Integer compute(){
        int sum = 0;
        for (int i = start; i <=end; i++) {
            sum+=i%16;
        }
        return sum;
    }

    public static void main(String[] args) {
        CountTest1 count = new CountTest1(1,10000000);
        long timeStart = System.currentTimeMillis();
        int compute = count.compute();
        long timeEnd = System.currentTimeMillis()-timeStart;
        System.out.println("Test1计算结果为："+compute+"计算时间为："+timeEnd);
    }
}
