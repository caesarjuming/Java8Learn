package com.NewConCurrent;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by caesar on 16/4/10.
 */
public class AtomicValue {
    private AtomicLong atomicLong=new AtomicLong(0);

    public void useItForAdd(){

        final long observed=10;
        //追踪不同线程的最大值
        long oldValue;
        long newValue;
        do {
            oldValue=atomicLong.get();
            newValue=Math.max(oldValue,observed);
        // 如果当前atomicLong的值不是oldValue那么如下会返回false
        }while (!atomicLong.compareAndSet(oldValue,newValue));

    }

    public void newUseItForAdd(){
        final long observed=10;
        // 其实和如上差不多
        atomicLong.updateAndGet(x->Math.max(x,observed));
    }

    public void otherMethod(){

        atomicLong.getAndAdd(10);
        // x是get到的,y是22
        atomicLong.getAndAccumulate(22,(x,y)->x>y?x:y);

    }

}
