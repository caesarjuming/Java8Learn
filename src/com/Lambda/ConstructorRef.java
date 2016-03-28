package com.Lambda;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by caesar on 16/3/28.
 */
public class ConstructorRef {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Stream<Button> stream=list.stream().map(Button::new);


    }

    public void deal(Object o){
        System.out.println(o);
    }
}
