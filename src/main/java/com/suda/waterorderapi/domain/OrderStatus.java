package com.suda.waterorderapi.domain;

public enum OrderStatus {
    REQUESTED("Order has been placed but not yet delivered."),
    INPROGRESS("Order is being delivered right now."),
    DELIVERED("Order has been delivered."),
    CANCELLED("Order was cancelled before delivery.");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }
}
