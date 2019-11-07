package com.codeman.springclouddemo.scheduler;

public class OFFStatus implements Status{

    private StatusType statusType = StatusType.OFF;
    @Override
    public void execute() {
        System.out.println("off status");
    }

    @Override
    public StatusType getStatusType() {
        return statusType;
    }
}
