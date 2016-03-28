package com.Lambda;

import java.util.Arrays;

/**
 * Created by caesar on 16/3/28.
 */
public class MethodRef {
    public static void main(String[] args) {
        //引用方法String类的compareTo方法
        Arrays.sort(new String[]{"a","aa"},String::compareTo);
        // 对象::实例方法 类似于直接调用
        // 类::静态方法  类似于直接调用
        // 类::实例方法  第一个参数为调用的方法,类似于 x.method(y)

        MethodRef methodRef=new MethodRef();
        methodRef.a();

    }

    public void a(){
        // 本对象的b方法
        Runnable run= this::b;
        Thread t=new Thread(run);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void b(){
        System.out.println("hello,thread");
    }

}
