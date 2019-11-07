package com.codeman.springclouddemo.scheduler;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StatusContext {
    private List<Status> statuses = null;

    public StatusContext() {
        this.statuses = new ArrayList<>();
        statuses.add(new ONStatus());
        statuses.add(new OFFStatus());
    }

    public Status getStatus(StatusType statusType) {
        for (Status status : statuses) {
            if (status.getStatusType().getCode() == statusType.getCode()) {
                return status;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        StatusContext statusContext = new StatusContext();
        Status status = statusContext.getStatus(StatusType.PASUE);
        Objects.requireNonNull(status, "not have this status");
        status.execute();
    }
}
