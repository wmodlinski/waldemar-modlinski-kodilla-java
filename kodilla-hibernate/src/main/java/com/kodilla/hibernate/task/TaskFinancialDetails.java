package com.kodilla.hibernate.task;

import com.sun.istack.NotNull;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TASKS_FINANCIALS")
public class TaskFinancialDetails {
    private int id;
    private BigDecimal price;
    private boolean paid;

    public TaskFinancialDetails() {
    }

    public TaskFinancialDetails(BigDecimal price, boolean paid) {
        this.price = price;
        this.paid = paid;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @Column(name = "PAID")
    public boolean isPaid() {
        return paid;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setPaid(boolean paid) {
        this.paid = paid;
    }
}