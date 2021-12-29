package com.ems.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "TBL_ADDRESS")
@Data
@EqualsAndHashCode(callSuper = false)
public class Address extends AbstractEntity{

    @Column(name = "PHONE_NUMBERS")
    private String phoneNumbers;

    @Column(name = "ADDRESS_LINES")
    private String addressLine;

    @Column(name = "ZIP_CODE")
    private String zipCode;

    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee;
}
