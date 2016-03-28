package com.Lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by caesar on 16/3/28.
 */
public class MyCompare {
    public static void main(String[] args) {
        // 用途,匿名函数,线程,listener等

        Comparator<Integer> comparable=(Integer i1, Integer i2) -> Integer.compare(i1,i2);
        System.out.println(comparable.compare(3,2));

        // 无参,多行,用{}分割
        MyLambdaInterface myLambdaInterface=()->{
            System.out.println("hello");
            System.out.println("world");
        };
        myLambdaInterface.sayHello();

        // 函数式接口只包含一个抽象方法的接口
        MyLambdaInterface2 myLambdaInterface2=(String sb)->{
            System.out.println("hello"+sb);
        };

        // 自动推断
        MyLambdaInterface2 myLambdaInterface21=sb-> System.out.println("new"+sb);

        myLambdaInterface21.sayHelloTo("caesar");
        myLambdaInterface2.sayHelloTo("jack");

        String []strArr={"aaaa","aa","aaa"};
        Arrays.sort(strArr,(final String str1,final String str2)->Integer.compare(str1.length(),str2.length()));

        // 函数式接口的转换是在Java中使用Lambda的唯一的地方





    }

}
