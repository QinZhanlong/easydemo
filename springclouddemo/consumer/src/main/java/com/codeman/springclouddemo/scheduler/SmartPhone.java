package com.codeman.springclouddemo.scheduler;

public class SmartPhone implements Phone {
    @Override
    public void send() {
        System.out.println("微信聊天");
    }
}
