package ForkAndJoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class CountTest2 extends RecursiveTask<Integer> {
    private static final int THRESHOLD = 100;
    private int start;
    private int end;

    public CountTest2(int start, int end) {
        this.start = start;
        this.end = end;
    }
    @Override
    protected Integer compute() {
        int sum = 0;
        boolean canCompute = (end - start) <= THRESHOLD;

        if (canCompute){
            for (int i = start; i <= end ; i++) {
                sum+=i%16;
            }
        }else {
            int middle = (start+end) /2 ;
            CountTest2 left = new CountTest2(start,middle);
            CountTest2 right = new CountTest2(middle+1,end);
            left.fork();
            right.fork();
            int leftResult = left.join();
            int rightResult = right.join();
            sum = leftResult+rightResult;
        }
        return sum;
    }
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        CountTest2 test = new CountTest2(1,10000000);
        long timeStart = System.currentTimeMillis();
        Future<Integer> result = forkJoinPool.submit(test);
        try {
            long timeEnd = System.currentTimeMillis()-timeStart;
            System.out.println("Test2计算结果为："+result.get()+"计算时间为："+timeEnd);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
