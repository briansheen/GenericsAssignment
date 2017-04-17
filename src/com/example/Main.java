package com.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String h = "hi!";
        Wrapper wrapper = new Wrapper(h);
        System.out.println(wrapper.getType());
        System.out.println(wrapper.getE());
        System.out.println(wrapper.hashCode());

        Integer y = 2;
        wrapper = new Wrapper(y);
        System.out.println(wrapper.getType());
        System.out.println(wrapper.getE());
        System.out.println(wrapper.hashCode());

        Map<Integer, Set<String>> map = new HashMap<>();
        Wrapper wrapper2 = new Wrapper(map);
        System.out.println(wrapper2.getType());
        System.out.println(wrapper2.getE());
        System.out.println(wrapper2.hashCode());

        List<Double> list = new ArrayList<>();
        wrapper2 = new Wrapper(list);
        System.out.println(wrapper2.getType());
        System.out.println(wrapper2.getE());
        System.out.println(wrapper2.hashCode());

        System.out.println(wrapper.equals(wrapper2));

        int x = 2;
        wrapper2 = new Wrapper(x);
        System.out.println(wrapper2.getType());
        System.out.println(wrapper2.getE());

        System.out.println(wrapper.equals(wrapper2));

    }
}
