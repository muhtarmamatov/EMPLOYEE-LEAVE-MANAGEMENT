package com.ems.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "TBL_CONTACT")
@Data
@EqualsAndHashCode(callSuper = false)
public class Contact extends AbstractEntity{

    @Column(name = "FULL_NAME")
    private String fullName;

    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;

    @Column(name = "PHONE_NUMBERS")
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee;
}
