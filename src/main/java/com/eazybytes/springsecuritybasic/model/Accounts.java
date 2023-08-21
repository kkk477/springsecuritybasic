package com.eazybytes.springsecuritybasic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Accounts {

    @Column(name = "customer_id")
    private int customerId;

    @Id
    @Column(name = "account_number")
    private Long accountNumber;

    @Column(name = "account_type")
    private Long accountType;

    @Column(name = "account_address")
    private Long accountAddress;

    @Column(name = "create_dt")
    private Long createDt;
}
