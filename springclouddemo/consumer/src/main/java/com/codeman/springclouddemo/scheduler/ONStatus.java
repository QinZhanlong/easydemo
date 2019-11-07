package com.codeman.springclouddemo.scheduler;

public class ONStatus implements Status {
    @Override
    public void execute() {
        System.out.println("on status");
    }

    @Override
    public StatusType getStatusType() {
        return StatusType.ON;
    }
}
