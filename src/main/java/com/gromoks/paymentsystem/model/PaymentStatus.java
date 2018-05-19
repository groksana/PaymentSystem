package com.gromoks.paymentsystem.model;

public enum PaymentStatus {
    REQUESTED("REQUESTED"), REJECTED("REJECTED"), ACCEPTED("ACCEPTED");

    private final String name;

    PaymentStatus(String name) {
        this.name = name;
    }

    public static PaymentStatus getByName(String name) {
        for (PaymentStatus paymentStatus : values()) {
            if (paymentStatus.name.equalsIgnoreCase(name)) {
                return paymentStatus;
            }
        }
        throw new IllegalArgumentException("Payment Status is not supported: " + name);
    }

}
