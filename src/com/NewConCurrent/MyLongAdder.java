package com.NewConCurrent;

import java.util.concurrent.*;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;

/**
 * Created by caesar on 16/4/10.
 */
public class MyLongAdder {
    //如果环境高度竞争就应该用LongAdder来代替AtomicLong

    public void useAdder(){
        ExecutorService pool=Executors.newFixedThreadPool(10);
        final LongAdder adder =new LongAdder();
        for (int i=0;i<10;i++){
            pool.submit(()->{
                for (int j = 0; j <10 ; j++) {
                    adder.increment();
                }
            });
        }

        System.out.println(adder.sum());
        pool.shutdown();
    }

    public static void useAccu(){
        ExecutorService executorService=Executors.newFixedThreadPool(10);
        LongAccumulator adder=new LongAccumulator((x,y)->(x*y),1);
        for (int i=1;i<=10;i++){
            final int ii=i;
            try {
                executorService.submit(()->{
                    System.out.println(ii);
                    adder.accumulate(ii);
                }).get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }



        long l=adder.get();
        System.out.println("::::::"+l);
        executorService.shutdown();

    }


    public static void main(String[] args) {
        useAccu();

    }
}
