package com.codeman.springclouddemo.bean;

public class People {
    static String contry = "china";
    int age;
    String name = "sre";

    public static void test() {
        System.out.println("nihao");
    }
    static {
        System.out.println("static people code");
    }

    {
        System.out.println("people code");
    }

    public People() {
        System.out.println("people");
    }
}
