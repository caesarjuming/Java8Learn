package com.Lambda;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;

/**
 * Created by caesar on 16/3/28.
 */
public class SomeFunction {
    public static void main(String[] args) {

        // java.util.function 定义了许多通用的函数式接口
        BiFunction<String,String,Integer>comp=(first,second)->Integer.compare(first.length(),second.length());
        System.out.println(comp.apply("aa","b"));

        // 异常可以在lambda中处理或者是把表达式赋值给一个可以抛出异常的抽象方法的接口
        Callable<String> call=()->{
            Thread.sleep(1);
            return "a";
        };



    }
}
