package stateDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SumByCallable implements Callable<Long> {

    private long start;
    private long end;

    public SumByCallable(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() throws Exception {
        long sum = 0L;
        for (long i = start; i < end; i++) {
            sum += Math.sqrt(i);
        }
        return sum;
    }

    //使用线程池+Callable接口
    public static void parallelSum(long N, int numThread) throws ExecutionException,
            InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(numThread);
        long start1 = System.currentTimeMillis();
        List<Future<Long>> ans = new ArrayList<>();
        for (long i = 0; i < numThread; i++) {
            Future<Long> a = executor.submit(
                    new SumByCallable(i * N / numThread, (i + 1) * N / numThread));
            ans.add(a);
        }
        long sum = 0;
        for (Future<Long> i : ans) {
            long tmp = i.get();
            System.out.println("线程 " + i + " 的结果是: " + tmp);
            sum += tmp;
        }
        //并行计算
        long end1 = System.currentTimeMillis();
        System.out.println("并行计算耗时：" + (end1 - start1) + " ms");
        System.out.println("并行计算的结果：" + sum);
    }
    // 串行计算
    public static void serialSum(long start,long end){
        long start1 = System.currentTimeMillis();
        long sum = 0L;
        for (long i = start; i < end; i++) {
            sum += Math.sqrt(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("串行计算耗时：" + (end1 - start1) + " ms");
        System.out.println("串行计算的结果：" + sum);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long end = 50000000l;
        SumByCallable.parallelSum(end,7);



    }
}