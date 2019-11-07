package com.codeman.springclouddemo.scheduler;

public class OldManPhone implements Phone {
    @Override
    public void send() {
        System.out.println("发送短信");
    }
}
