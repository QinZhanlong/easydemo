package com.codeman.springclouddemo.scheduler;

public class MultiPhoneFactory {
    public static Phone sendMsg() {
        return new OldManPhone();
    }
    public static Phone sendWeChat() {
        return new SmartPhone();
    }

    public static void main(String[] args) {
        Phone phone = MultiPhoneFactory.sendMsg();
        Phone phone1 = MultiPhoneFactory.sendWeChat();
        phone.send();
        phone1.send();
    }
}
