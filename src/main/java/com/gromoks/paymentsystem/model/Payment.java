package com.gromoks.paymentsystem.model;

import java.time.LocalDateTime;

public class Payment {
    private long id;
    private String description;
    private PaymentStatus status;
    private User user;
    private LocalDateTime date;
    private double amount;
    private String currency;

    public Payment() {
    }

    public Payment(long id, String description, double amount, String currency) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.currency = currency;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", user=" + user +
                ", date=" + date +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
