package com.StreamAPI;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caesar on 16/4/7.
 */
public class MyFirstStream {
    public static void main(String[] args) {
        List<String> mylist=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            mylist.add(i,i+""+i);
        }
        long l =mylist.stream().filter(w->Integer.parseInt(w)>50).count();
        System.out.println(l);

        // stream 和 集合类的区别

        // 1,stream自己不会储存.元素可能储存在底层的集合中,或者根据需要产生出来
        // 2,stream操作符不会改变源对象.相反,他们会返回新的stream
        // 3,stream操作符可能是延迟执行的,可能等到需要结果时才执行

        // 并行执行
        long l1 =mylist.parallelStream().filter(w->Integer.parseInt(w)>50).count();


    }
}
