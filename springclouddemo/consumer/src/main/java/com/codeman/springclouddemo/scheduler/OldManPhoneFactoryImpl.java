package com.codeman.springclouddemo.scheduler;

public class OldManPhoneFactoryImpl implements IFactory {
    @Override
    public Phone send() {
        return new OldManPhone();
    }



    public static void main(String[] args) {
        IFactory iFactory = new OldManPhoneFactoryImpl();
        Phone phone = iFactory.send();
        phone.send();
        IFactory iFactory1 = new SmartPhoneFactoryImpl();
        phone = iFactory1.send();
        phone.send();

    }
}

class SmartPhoneFactoryImpl implements IFactory {
    @Override
    public Phone send() {
        return new SmartPhone();
    }
}
