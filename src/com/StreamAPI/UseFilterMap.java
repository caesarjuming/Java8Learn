package com.StreamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by caesar on 16/4/7.
 */
public class UseFilterMap {
    public static void main(String[] args) {

        Integer[] ints=new Integer[]{1,2,3,4,5,6};
        Stream<Integer> stream=Arrays.stream(ints,0,ints.length);
        Object[] newInteger=stream.map(x->x=x+1).toArray();

        for (int i = 0; i < ints.length; i++) {
            System.out.println(((Integer)newInteger[i]).intValue());
        }


    }
}
