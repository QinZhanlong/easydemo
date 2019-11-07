package com.codeman.springclouddemo.bean;

import java.io.Serializable;

public class Man extends People implements Serializable {
    private static final long serialVersionUID = 6368403260237056092L;
    static String provision = "shanxi";
    String fale = "man";

    static {
        System.out.println("static code man");
    }

    {
        System.out.println("code man");
    }

    public Man() {
        System.out.println(fale);
        System.out.println("man");
    }

    public static void main(String[] args) {
        People people = new Man();
    }
}
