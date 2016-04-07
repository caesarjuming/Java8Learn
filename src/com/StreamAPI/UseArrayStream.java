package com.StreamAPI;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by caesar on 16/4/7.
 */
public class UseArrayStream {
    public static void main(String[] args) {

        Stream<String> words=Stream.of("a","aaa","aaaa");

        String[] arr=new String[]{"b","bb","bbb"};
        Arrays.stream(arr,0,arr.length);

        // 创建一个空的stream,以下是相等的,上面这个可以推导
        Stream<String> slience=Stream.empty();
        Stream<String> slience1=Stream.<String>empty();

        // 创建一个含有常量的Stream
        Stream<String> echos=Stream.generate(()->"Echo");
        Stream<Double> randoms=Stream.generate(Math::random);

        // 创建无限序列
        Stream<BigInteger> integers=Stream.iterate(BigInteger.ZERO,n->n.add(BigInteger.ONE));
    }
}
