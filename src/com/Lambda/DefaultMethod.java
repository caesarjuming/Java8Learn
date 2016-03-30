package com.Lambda;

/**
 * Created by caesar on 16/3/30.
 */
public interface DefaultMethod {
    default String getName(){
        return "jack";
    }
    String getOldName();
}
interface DefaultMethod2{
    default String getName(){
        return "caesar";
    }
}



class UseDefaultMethod implements DefaultMethod,DefaultMethod2{

    @Override
    public String getOldName() {
        return "old";
    }

    // 解决两个相同default方法的方法是重写这个方法,然后在这个方法中由程序员决定调哪个
    // 如果DefaultMethod2接口中无getName方法,也会报错
    // 只要接口中有default方法,就得手动解决
    // 如果继承的类和接口同时有一个方法,类优先
    public String getName(){
        return DefaultMethod.super.getName();
    }
}
