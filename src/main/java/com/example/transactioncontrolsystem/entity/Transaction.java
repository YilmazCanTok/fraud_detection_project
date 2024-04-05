package com.example.transactioncontrolsystem.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "credit_card_transactions")
public class Transaction {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull(message = "Time can't be null")
    @Column(name = "Time")
    private Integer Time;

    @NotNull(message = "V1 can't be null")
    @Column(name = "V1")
    private Double V1;

    @NotNull(message = "V2 can't be null")
    @Column(name = "V2")
    private Double V2;

    @NotNull(message = "V3 can't be null")
    @Column(name = "V3")
    private Double V3;

    @NotNull(message = "V4 can't be null")
    @Column(name = "V4")
    private Double V4;

    @NotNull(message = "V5 can't be null")
    @Column(name = "V5")
    private Double V5;

    @NotNull(message = "V6 can't be null")
    @Column(name = "V6")
    private Double V6;

    @NotNull(message = "V7 can't be null")
    @Column(name = "V7")
    private Double V7;

    @NotNull(message = "V8 can't be null")
    @Column(name = "V8")
    private Double V8;

    @NotNull(message = "V9 can't be null")
    @Column(name = "V9")
    private Double V9;

    @NotNull(message = "V10 can't be null")
    @Column(name = "V10")
    private Double V10;

    @NotNull(message = "V11 can't be null")
    @Column(name = "V11")
    private Double V11;

    @NotNull(message = "V12 can't be null")
    @Column(name = "V12")
    private Double V12;

    @NotNull(message = "V13 can't be null")
    @Column(name = "V13")
    private Double V13;

    @NotNull(message = "V14 can't be null")
    @Column(name = "V14")
    private Double V14;

    @NotNull(message = "V15 can't be null")
    @Column(name = "V15")
    private Double V15;

    @NotNull(message = "V16 can't be null")
    @Column(name = "V16")
    private Double V16;

    @NotNull(message = "V17 can't be null")
    @Column(name = "V17")
    private Double V17;

    @NotNull(message = "V18 can't be null")
    @Column(name = "V18")
    private Double V18;

    @NotNull(message = "V19 can't be null")
    @Column(name = "V19")
    private Double V19;

    @NotNull(message = "V20 can't be null")
    @Column(name = "V20")
    private Double V20;

    @NotNull(message = "V21 can't be null")
    @Column(name = "V21")
    private Double V21;

    @NotNull(message = "V22 can't be null")
    @Column(name = "V22")
    private Double V22;

    @NotNull(message = "V23 can't be null")
    @Column(name = "V23")
    private Double V23;

    @NotNull(message = "V24 can't be null")
    @Column(name = "V24")
    private Double V24;

    @NotNull(message = "V25 can't be null")
    @Column(name = "V25")
    private Double V25;

    @NotNull(message = "V26 can't be null")
    @Column(name = "V26")
    private Double V26;

    @NotNull(message = "V27 can't be null")
    @Column(name = "V27")
    private Double V27;

    @NotNull(message = "V28 can't be null")
    @Column(name = "V28")
    private Double V28;


}
