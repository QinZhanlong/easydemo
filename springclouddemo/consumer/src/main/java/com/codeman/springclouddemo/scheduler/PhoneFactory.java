package com.codeman.springclouddemo.scheduler;

import java.util.Objects;

public class PhoneFactory {
    public Phone send(String type){
        if (Objects.equals("OldManPhone", type)){
            return new OldManPhone();
        } else if (Objects.equals("SmartPhone", type)){
            return new SmartPhone();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone phone = phoneFactory.send("OldManPhone");
        Phone phone1 = phoneFactory.send("SmartPhone");
        phone.send();
        phone1.send();
    }
}

