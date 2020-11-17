package com.trade_accounting.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Company {

    private Long id;
    private String name;
    private String sortNumber;
    private String phone;
    private String fax;
    private String email;
    private boolean payerVAT;
    private String address;
    private String commentToAddress;
    private String leader;
    private String leaderManagerPosition;
    private String leaderSignature;
    private String chiefAccountant;
    private String chiefAccountantSignature;
    private String stamp;
}
