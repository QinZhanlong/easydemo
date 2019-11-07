package com.codeman.springclouddemo.scheduler;

public enum StatusType {

    ON(0), OFF(1), PASUE(2);

    private int code;
    StatusType(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }
}
