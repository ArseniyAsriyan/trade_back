package com.trade_accounting.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "companies")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "inn", unique = true)
    private String inn;

    @Column(name = "sort_number")
    private String sortNumber;

    @Column(name = "phone")
    private String phone;

    @Column(name = "fax")
    private String fax;

    @Column(name = "email")
    private String email;

    @Column(name = "payer_vat")
    private Boolean payerVat;

    @Column(name = "address")
    private String address;

    @Column(name = "comment_to_address")
    private String commentToAddress;

    @Column(name = "leader")
    private String leader;

    @Column(name = "leader_manager_position")
    private String leaderManagerPosition;

    @Column(name = "leader_signature")
    private String leaderSignature;

    @Column(name = "chief_accountant")
    private String chiefAccountant;

    @Column(name = "chief_accountant_signature")
    private String chiefAccountantSignature;

    @Column(name = "stamp")
    private String stamp;
}