package com.Lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caesar on 16/3/30.
 */
public class LambdaScope {
    public static void main(String[] args) {
        LambdaScope lambdaScope=new LambdaScope();
        lambdaScope.myMethod("sss",10);


    }
    private static int outi=0;

    // 类似于闭包
    public void myMethod(String str,int count){
        List<String> list=new ArrayList<>();

        Runnable runnable=()->{
            for (int i = 0; i <count ; i++) {
                System.out.println(str+":"+i);
                // 变量内的东西可以被修改 不能修改引用
                list.add(str);
                // 调用的是LambdaScope的tostring方法
                this.toString();
                // String list="myList"; 不能和外面的变量重复
            }
            // 外面的值在里面是不能够被修改的 count=0;
            // 因为会引起多线程的不安全
            // 不可变约束只在局部变量上

            //可以修改类变量
            outi++;

        };

        Thread t=new Thread(runnable);
        t.start();
    }

}
